package ru.job4j.array;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 06.07.2019
 */
public class FindLoop {
    /**
     * Method indexOf.
     * @param data,el (массив и искомое значение)
     * @return индекс искомого элемента или -1,если его нет в массиве
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; //если элемента нет в массиве,возвращаем -1
        for (int index = 0; index != data[index]; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
