package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 06.07.2019
 */
public class TurnTest {
    /**
     * Test метода back с четным количеством элементов в массиве
      */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }
    /**
     * Test метода back с нечетным количеством элементов в массиве
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{1, 3, 5, 7, 9, 11, 13};
        int[] resultArray = turner.back(input);
        int[] expectArray = new int[]{13, 11, 9, 7, 5, 3, 1};
        assertThat(resultArray, is(expectArray));

    }
}
