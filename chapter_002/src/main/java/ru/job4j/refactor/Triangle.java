package ru.job4j.refactor;

/**
 * @author Stanislau Sinkevich. (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 29.07.2019
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * <p>
     * Формула.
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a и b
     * @param b расстояние между точками a и c
     * @param c расстояние между точками b и c
     * @return полупериметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * <p>
     * Теорема.
     * Каждая из сторон треугольника должна быть меньше суммы двух других.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return true или false
     */
    private boolean exist(double a, double b, double c) {
        boolean result = false;
        if ((a < b + c) && b < (a + c) && (c < a + b)) {
            result = true;
        }
        return result;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     * <p>
     * Формула.
     * <p>
     * √ p *(p - a) * (p - b) * (p - c)
     * <p>
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double a = this.first.distance(this.second);
        double b = this.second.distance(this.third);
        double c = this.third.distance(this.first);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}