package ru.job4j.condition;
/**
 * @author Stanislau S. (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 02.07.2019
 */
public class Triangle {
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
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return rsl;
        }
    }
}