package exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
public class AppTest {
    private static String[][] image;
    private static String[][] emptyImage;
    private static String[][] oneElementImage;
    @BeforeAll
    public static void init() {
        image = new String[][] {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        emptyImage = new String[][] {};
        oneElementImage = new String[][] {{"*"}};

    }

    @Test
    public void check_new_length_enlargeArrayImage() {
        var expectedArray = App.enlargeArrayImage(image);
        var expectedYSize = image.length * 2;
        var expectedXSize = image.length * 2;
        assertThat(expectedArray.length).isEqualTo(expectedYSize);
        assertThat(expectedArray[0].length).isEqualTo(expectedXSize);

        expectedArray = App.enlargeArrayImage(emptyImage);
        expectedYSize = 0;
        assertThat(expectedArray.length).isEqualTo(expectedYSize);

        expectedArray = App.enlargeArrayImage(oneElementImage);
        expectedXSize = 2;
        expectedYSize = 2;
        assertThat(expectedArray.length).isEqualTo(expectedYSize);
        assertThat(expectedArray[0].length).isEqualTo(expectedXSize);

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

        actualArray = App.enlargeArrayImage(emptyImage);
        expectedArray = new String[][] {};

        assertThat(expectedArray).isEqualTo(actualArray);

        actualArray = App.enlargeArrayImage(oneElementImage);
        expectedArray = new String[][] {
                {"*", "*"},
                {"*", "*"}
        };

        assertThat(expectedArray).isEqualTo(actualArray);

    }
}
// END
