package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    /**
     * Test метода indexOf при данном масиве {12, 5, 7, 3} и искомом значении 4
     * Метод ничего не найдет и выдаст  -1
     */
    @Test
    public void whenArrayHas4ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {12, 5, 7, 3};
        int value = 4;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    /**
     * Test метода indexOf при данном масиве {1, 9, 5, 8} и искомом значении 8
     * Метод должен найти наш элемент и вывести его индекс
     */
    @Test
    public void whenArrayHas8Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 9, 5, 8};
        int value = 8;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    /**
     * Test метода indexOf при данном масиве {5, 10, 3} и искомом значении 5
     * Метод должен найти наш элемент и вывести его индекс
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
}