package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {

        var keys = new TreeSet<String>();
        keys.addAll(data1.keySet());
        keys.addAll(data2.keySet());

        Function<String, Map<String, String>> comparator = key -> {
            if (!data1.containsKey(key)) {
                return Map.of(key, "added");
            } else if (!data2.containsKey(key)) {
                return Map.of(key, "deleted");
            } else if (data1.get(key).equals(data2.get(key))){
                return Map.of(key, "unchanged");
            } else {
                return Map.of(key, "changed");
            }
        };

        return keys.stream()
                .map(comparator)
                .collect(LinkedHashMap::new,
                        LinkedHashMap::putAll,
                        LinkedHashMap::putAll
                        );
    }
}
//END
