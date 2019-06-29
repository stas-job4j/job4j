package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.

 *@author Stanislau S. (saydobenothing@gmail.com)
 *@version 1.0
 *@since 29.06.2019

 */
public class CalculatorTest  {
    /**
     * Test add.
     */

    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test substract.
     */

    @Test
    public void whenSubstract2On2Then1() {
        Calculator calc = new Calculator();
        double result = calc.substract(2D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Test div.
     */

    @Test
    public void whenDiv4On2Then2() {
        Calculator calc = new Calculator();
        double result = calc.div(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test multiple.
     */

    @Test
    public void whenMultiple2On2Then4() {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 2D);
        double expected = 4D;
        assertThat(result, is(expected));
    }
}