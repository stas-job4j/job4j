package ru.job4j.array;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 05.07.2019
 */
public class Square {
    /**
     * Method calculate.
     * @param bound (длина массива).
     * @return массив чисел ,начиная с единицы,возведенных в квадрат.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i != bound; i++) {
            rst[i] = (int) Math.pow((i + 1), 2);
        }
        return rst;
    }
}