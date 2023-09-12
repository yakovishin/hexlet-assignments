package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        final String separator = "";
        List<String> lettersList = new ArrayList<>(Arrays.asList(letters.split(separator)));
        String[] wordLetters = word.split(separator);
        int index;
        for (String letter: wordLetters) {
            index = lettersList.indexOf(letter.toLowerCase());
            if (index != -1) {
                lettersList.remove(index);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
