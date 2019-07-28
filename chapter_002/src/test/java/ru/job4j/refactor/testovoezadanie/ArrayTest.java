package ru.job4j.refactor.testovoezadanie;

import ru.job4j.testovoezadanie.Array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 07.07.2019
 */

public class ArrayTest {
    /**
     * Test метода sort при длине массива 20
     */

    @Test
    public void whenTwoSortArrayWithThreeElementsThenSumSortedArray() {
        Array arr = new Array();
        int[] input1 = new int[]{1, 3, 5};
        int[] input2 = new int[]{2, 4, 6};
        int[] resultArray = arr.merge(input1, input2);
        int[] expectArray = new int[]{1, 2, 3, 4, 5, 6};
        assertThat(resultArray, is(expectArray));
    }
    @Test
    public void whenTwoSortArrayWithSixElementsThenSumSortedArray() {
        Array arr = new Array();
        int[] input1 = new int[]{0, 3, 5, 8, 13, 100};
        int[] input2 = new int[]{2, 4, 6, 12, 18, 27};
        int[] resultArray = arr.merge(input1, input2);
        int[] expectArray = new int[]{0, 2, 3, 4, 5, 6, 8, 12, 13, 18, 27, 100};
        assertThat(resultArray, is(expectArray));
    }
}