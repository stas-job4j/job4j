package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 07.07.2019
 */
public class BubbleSortTest {
    /**
     * Test метода sort при длине массива 20
     */
    @Test
    public void whenSortArrayWithTwentyElementsThenSortedArray() {
        BubbleSort bs = new BubbleSort();
        int[] input = new int[] {14, 5, 2, 2, 18, 90, 1, 12, 0, 7, 199, 0, 40, 11, 15, 20, 70, 52, 0, 34 };
        int[] resultArray = bs.sort(input);
        int[] expectArray = new int[] {0, 0, 0, 1, 2, 2, 5, 7, 11, 12, 14, 15, 18, 20, 34, 40, 52, 70, 90, 199};
        assertThat(resultArray, is(expectArray));
    }
    /**
     * Test метода sort при длине массива 10
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bs = new BubbleSort();
        int[] input = new int[] {1, 3, 5, 2, 4, 9, 8, 6, 0, 7};
        int[] resultArray = bs.sort(input);
        int[] expectArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(resultArray, is(expectArray));
    }
}




