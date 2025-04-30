package CollectionsFrameWork.Q2UniqueWordFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String paragraph = "Java is simple. Java is powerful. Java is everywhere.";

        String[] words = paragraph.toLowerCase().replaceAll("[^a-z ]", "") .split("\\s+");
        Map<String, Integer> wordFreq = new HashMap<>();

        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }
        Set<String> uniqueWords = new TreeSet<>(wordFreq.keySet());

        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordFreq.get(word));
        }
    }
}
