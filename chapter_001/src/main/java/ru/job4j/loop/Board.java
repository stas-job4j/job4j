package ru.job4j.loop;

public class Board {
    /**
     * Method paint.
     * @param width,height .
     * @return шахматная доска в псевдографике.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        int a, b;
        for (a = 0; a < height; a++) {
            for (b = 0; b < width; b++) {
                // условие проверки, что писать Х или пробел . При сумме индексов=четному числу пишем Х,иначе пробел
                if ((a + b) % 2 == 0) {
                    screen.append("x");
                    //иначе " пробел "
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}