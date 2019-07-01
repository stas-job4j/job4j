package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * Test.

 *@author Stanislau S. (saydobenothing@gmail.com)
 *@version $1.0$
 *@since 01.07.2019
 */
public class MultiMaxTest {
    /**
     * Test int first = Max
     */
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }

    /**
     * Test int second = Max
     */
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Test int third = Max
     */
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 1, 3);
        assertThat(result, is(3));
    }

    /**
     * Test first=second=third
     */
    @Test
    public void whenEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 2, 2);
        assertThat(result, is(2));
    }
}