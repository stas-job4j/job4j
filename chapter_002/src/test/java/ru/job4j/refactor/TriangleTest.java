package ru.job4j.refactor;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * @author Stanislau Sinkevich. (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 29.07.2019
 */
public class TriangleTest {
    /**
     * Test ( сравниваем площадь получившегося треугольника с ожидаемой )
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(2, 0);
        Triangle triangle = new Triangle(point1, point2, point3);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }
}