package fileinputoutput.q15;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharFrequencyCounter implements Serializable {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String serializedFileName = "charfreq.ser";
        String outputFileName = "charcount.txt";

        try{
            Map<Character, Integer> frequencyMap = countCharacterFrequency(inputFileName);

            serializeFrequencyMap(frequencyMap, serializedFileName);

            Map<Character, Integer> deserializedFrequencyMap = deserializeFrequencyMap(serializedFileName);
            writeFrequencyToFile(deserializedFrequencyMap, outputFileName);

            System.out.println("Character frequency has been stored in " + outputFileName);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private static Map<Character, Integer> countCharacterFrequency(String inputFileName) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
            int ch;
            while ((ch = br.read()) != -1) {
                char character = (char) ch;
                frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return frequencyMap;
    }

    private static void serializeFrequencyMap(Map<Character, Integer> frequencyMap, String fileName) throws IOException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(frequencyMap);
        }
    }

    @SuppressWarnings("unchecked")
    private static Map<Character, Integer> deserializeFrequencyMap(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Map<Character, Integer>) ois.readObject();
        }
    }

    private static void writeFrequencyToFile(Map<Character, Integer> frequencyMap, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                writer.write("'" + entry.getKey() + "' : " + entry.getValue());
                writer.newLine();
            }
        }
    }
}