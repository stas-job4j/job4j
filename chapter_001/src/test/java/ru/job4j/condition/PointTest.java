package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.

 *@author Stanislau S. (saydobenothing@gmail.com)
 *@version 1.0
 *@since 29.06.2019
 */
public class PointTest {
    /**
     * Test y = 10
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}