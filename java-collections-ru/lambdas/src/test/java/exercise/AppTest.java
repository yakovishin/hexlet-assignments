package exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class AppTest {
    private static String[][] image;
    @BeforeAll
    public static void init() {
        image = new String[][] {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
    }

    @Test
    public void check_new_length_enlargeArrayImage() {
        var newArray = App.enlargeArrayImage(image);
        var expectedYSize = image.length * 2;
        var expectedXSize = image.length * 2;
        assertThat(newArray.length).isEqualTo(expectedYSize);
        assertThat(newArray[0].length).isEqualTo(expectedXSize);
    }

    @Test
    public void check_enlargeArrayImage() {
        var actualArray = App.enlargeArrayImage(image);
        var expectedArray = new String[][]{
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"}
        };

        assertThat(expectedArray).isEqualTo(actualArray);
    }
}
// END
