package ru.job4j.sqarea;

/**
 * Программа расчета идеального веса.
 */
public class SqArea {
    /**
     * Длина,высота и площадь треугольника.
     * @param p,k - периметр и коэффициент соответственно.
     * @return w*h = s ( s - площадь прямоугольника ) .
     */
    public int square(int p, int k) {
        int h = p / (2 + 2 * k);
        int w = h * k;
        return w * h;
    }
}