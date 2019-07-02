package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.

 *@author Stanislau S. (saydobenothing@gmail.com)
 *@version $1.0$
 *@since 02.07.2019

 */
public class CounterTest {
    /**
     * Test метода add в диапазоне от start = 1 до finish = 10 (должно получиться 2+4+6+8+10 = 30 ).
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter c = new Counter();
        int result = c.add(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }
}