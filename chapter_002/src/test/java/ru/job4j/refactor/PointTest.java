package ru.job4j.refactor;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.

 *@author Stanislau S. (saydobenothing@gmail.com)
 *@version $1.0$
 *@since 18.07.2019
 */
public class PointTest {
    /**
     * Test that.y = 10
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     * Test проверяющий расстояние точки до самой себя = 0
     */
    @Test
    public void whenCheckItSelf() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    /**
     * Test вывод значений полей x , y
     */
    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }
}