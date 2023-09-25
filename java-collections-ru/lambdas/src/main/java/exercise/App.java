package exercise;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        var newYLength = image.length * 2;
        var newXLength = image[0].length * 2;
        var resultArray = new String[newYLength][newXLength];

        for (int i = 0, y = 0; i < resultArray.length; i+=2, y++) {
            for (int j = 0, x = 0; j < resultArray[i].length; j+=2, x++) {
                var copyValue = image[y][x];
                resultArray[i][j] = copyValue;
                resultArray[i + 1][j] = copyValue;
                resultArray[i][j + 1] = copyValue;
                resultArray[i + 1][j + 1] = copyValue;
            }
        }
        return resultArray;
    }
}
// END
