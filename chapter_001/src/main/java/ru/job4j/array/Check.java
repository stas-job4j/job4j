package ru.job4j.array;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 07.07.2019
 */
public class Check {
    /**
     * Method mono.
     * @param data массив boolean значений.
     * @return true (если массив однородный)  иначе false
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datan : data) {
            if (data[0] != datan) {
                result = false;
                break;
            }
        }
        return result;

    }
}
