package ru.job4j.array;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 07.07.2019
 */
public class ArrayChar {
    /**
     * Method startsWith проверяет,что слово начинается с префикса
     * @param prefix,word (префикс / слово )
     * @return true либо false в зависимости от результата
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i < pref.length; i++) {
            if (pref[i] != wrd[i]) {
                result = false;
            }
        }
        return result;
    }
}
