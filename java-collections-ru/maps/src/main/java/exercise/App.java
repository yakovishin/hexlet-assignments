package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word: words) {
            if (word.isBlank()) {
                continue;
            }
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.replace(word, wordCount.get(word) + 1);
            }
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        StringBuilder builder = new StringBuilder("{");
        for(Map.Entry<String, Integer> entry: wordCount.entrySet()) {
            builder.append("\n\s\s").append(entry.getKey()).append(": ").append(entry.getValue());
        }
        if (builder.length() > 1) {
            builder.append("\n}");
        } else {
            builder.append("}");
        }
        return builder.toString();
    }
}
//END
