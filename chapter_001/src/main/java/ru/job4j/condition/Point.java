package ru.job4j.condition;

/**
 * Программа расчета расстояния между точками в системе координат.
 */
public class Point {
    /**
     * Метод для рассчета расстояния между точками в системе координат.
     * @param  x1,y1,x2,y2 точки координат.
     * @return расстояние между точками.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}