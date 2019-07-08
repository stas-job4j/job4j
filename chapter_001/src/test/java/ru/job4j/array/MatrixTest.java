package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 08.07.2019
 */
public class MatrixTest {
    /**
     * Тест метода sort при size = 5 .
     * Должна получиться матрица = таблице умножения от 1 до  5 .
     */
    @Test
    public void when5on5() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(5);
        int[][] expect = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        assertThat(table, is(expect));
    }
    /**
     * Тест метода sort при size = 2 .
     * Должна получиться матрица = таблице умножения от 1 до  2 .
     */
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
}