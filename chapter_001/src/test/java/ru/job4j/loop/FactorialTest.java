package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.

 *@author Stanislau S. (saydobenothing@gmail.com)
 *@version $1.0$
 *@since 03.07.2019

 */
public class FactorialTest {
    /**
     * Test метода calc в диапазоне от 1  до n = 5 (должно получиться 1*2*3*4*5 = 120 ).
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial f = new Factorial();
        int result = f.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    /**
     * Test метода calc для n=0 (на выходе должны получить 1 т.к. факториал чисел 0,1 = 1 ).
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial f = new Factorial();
        int result = f.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}

