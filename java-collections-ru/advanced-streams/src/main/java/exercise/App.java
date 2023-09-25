package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String data) {
        final var emptyString = "";
        if (data.isEmpty()) {
            return emptyString;
        }
        final var quote = "\"";
        final var commaDelimiter = ",";
        final var keyDelimiter = "X_FORWARDED_";

        return Arrays.stream(data.split(System.lineSeparator()))
                .filter(line -> line.startsWith("environment="))
                .map(line -> line.substring(line.indexOf(quote) + 1, line.lastIndexOf(quote)))
                .flatMap( s -> Arrays.stream(s.split(commaDelimiter)))
                .filter(s -> s.startsWith(keyDelimiter))
                .map(s -> s.replaceAll(keyDelimiter, emptyString))
                .collect(Collectors.joining(commaDelimiter));

    }
}
//END
