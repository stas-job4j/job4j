package ru.job4j.refactor;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Программа расчета расстояния между точками в системе координат.
 *
 * @author Stanislau S. (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 18.07.2019
 */

public class Point {
    private int x;
    private int y;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     *
     * @param firs  координата x
     * @param second координата y
     */
    public Point(int firs, int second) {
        this.x = firs;
        this.y = second;
    }

    /**
     * Метод для рассчета расстояния между точками в системе координат.
     *
     * @param that ( переменная типа Point )
     * @return расстояние между точками.
     */

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Метод,выводящий информацию в консоль
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

}
