package ru.job4j.refactor;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Программа расчета расстояния между точками в системе координат.
 *
 * @author Stanislau Sinkevich (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 30.07.2019
 */

public class Point {
    private int x;
    private int y;
    private int z;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
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

    public double distance3D(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
    /**
     * Метод,выводящий информацию в консоль
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

}
