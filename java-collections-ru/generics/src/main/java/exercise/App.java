package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books,
                                                      Map<String, String> where) {
        var result = new ArrayList<Map<String, String>>();
        var whereKeys = where.keySet();
        var whereValues = where.values();
        for (Map<String, String> book : books) {
            if (book.keySet().containsAll(whereKeys) && book.values().containsAll(whereValues)) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
