package ru.job4j.array;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 08.07.2019
 */
public class Matrix {
    /**
     * Method multiple - создает двумерный массив(матрицу)  size*size .
     * @param size размер двумерного массива (матрицы).
     * @return таблица умножения до числа = size
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }







        return table;
    }
}

