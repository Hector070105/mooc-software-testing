package tudelft.sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    @Test
    void sumaSinAcarreo() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(3, 4))
        );

        assertEquals(new ArrayList<>(Arrays.asList(4, 6)), result);
    }

    @Test
    void sumaConAcarreo() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 9)),
                new ArrayList<>(Arrays.asList(1))
        );

        assertEquals(new ArrayList<>(Arrays.asList(1, 0, 0)), result);
    }

    @Test
    void sumaConListasDeDiferenteTamano() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(7))
        );

        assertEquals(new ArrayList<>(Arrays.asList(1, 3, 0)), result);
    }
}