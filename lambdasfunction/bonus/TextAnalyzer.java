package lambdasfunction.bonus;

import java.util.HashMap;
import java.util.Map;

public class TextAnalyzer {
    public static Map<String, Integer> analyzeText(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            return new HashMap<>();
        }
        String[] words = paragraph.toLowerCase().split("\\W+");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordFrequencyMap;
    }

    public static void main(String[] args) {
        String paragraph = "Java is great! Java is powerful. Java, Java, and more Java.";

        Map<String, Integer> wordFrequency = analyzeText(paragraph);

        System.out.println("Word Frequencies:");
        wordFrequency.forEach((word, frequency) ->
                System.out.println(word + ": " + frequency)
        );
    }
}
