package ru.job4j.array;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 08.07.2019
 */
public class MatrixCheck {
    /**
     * Method mono
     *
     * @param data массив состоящий из boolean значений.
     * @return при равенстве элементов по диагоналям возвращает true , иначе false.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int i, j;
        for (i = 0, j = data.length - 1; i < data.length; i++, j--) {
            if ((data[0][0] != data[i][i]) || (data[0][data.length - 1] != data[i][j])) {
                result = false;
                break;
            }
        }
        return result;

    }
}