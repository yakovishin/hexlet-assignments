package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    private static final List<Integer> list = new ArrayList<>();
    @BeforeEach
    public void init() {
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
    }

    @Test
    void testTake() {
        // BEGIN
        var newLength = 3;
        var expected = List.of(Arrays.copyOf(list.toArray(), newLength));

        assertThat(App.take(list, newLength)).isEqualTo(expected);
        assertThat(expected.size()).isEqualTo(newLength);
        // END
    }
}
