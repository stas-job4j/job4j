package ru.job4j.refactor;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test.

 *@author Stanislau Sinkevich (saydobenothing@gmail.com)
 *@version $1.0$
 *@since 30.07.2019
 */
public class PointTest {
    /**
     * Test that y = 10
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        System.out.println("Тесты метода distance3D :");
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
        System.out.println("Тесты метода distance :");
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }

    /**
     * Test that y = 10 , x =0 , z = 0
     */
    @Test
    public void whenZeroAndTenAndZeroThenTen3D() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        Point third = new Point(0, 0);
        double result = second.distance3D(third);
        first.info();
        second.info();
        third.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     * Test проверяющий расстояние точки до самой себя = 0
     */
    @Test
    public void whenCheckItSelf3D() {
        Point point = new Point(0, 0);
        double result = point.distance3D(point);
        assertThat(result, is(0D));
    }

    /**
     * Test вывод значений полей x, y, z
     */
    @Test
    public void whenShowInfo3D() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
        Point third = new Point(4, 4);
        third.info();
    }
}