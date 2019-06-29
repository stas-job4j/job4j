package ru.job4j.sqarea;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Test.

 *@author Stanislau S. (saydobenothing@gmail.com)
 *@version 1.0
 *@since 29.06.2019

 */
public class SqAreaTest {
    /**
     * Test p4k1s1.
     */
    @Test
    public void p4k1s1() {
        assertThat(new SqArea().square(4, 1), is(1));
    }

    /**
     * Test p6k2s2.
     */
    @Test
    public void p6k2s2() {
        assertThat(new SqArea().square(6, 2), is(2));
    }
}