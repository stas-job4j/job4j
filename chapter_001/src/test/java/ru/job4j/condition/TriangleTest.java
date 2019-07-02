package ru.job4j.condition;

//import org.junit.Ignore; (В примере есть,но мы его не испоьзовали,инспектор ругается)
import org.junit.Test;
//import org.junit.experimental.categories.Categories; (В примере есть,но мы его не испоьзовали,инспектор ругается)

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * @author Stanislau S. (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 02.07.2019
 */

public class TriangleTest {
    /**
     * Test ( сравниваем площадь получившегося треугольника с ожидаемой )
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle();
        // Вычисляем площадь.
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}