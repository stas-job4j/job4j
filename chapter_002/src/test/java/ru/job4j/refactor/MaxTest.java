package ru.job4j.refactor;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.

 *@author Stanislau Sinkevich (saydobenothing@gmail.com)
 *@version $1.0$
 *@since 30.07.2019
 */
public class MaxTest {
    /**
     * Test first < second
     */
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Test first > second
     */
    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    /**
     * Test first = second
     */
    @Test
    public void whenMax1To1Then1() {
        Max max = new Max();
        int result = max.max(1, 1);
        assertThat(result, is(1));
    }

    /**
     * Test first = max
     */
    @Test
    public void whenMax3To2To1Then3() {
        Max max = new Max();
        int result = max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    /**
     * Test first = second = third
     */
    @Test
    public void whenMax4To4To4Then4() {
        Max max = new Max();
        int result = max.max(4, 4, 4);
        assertThat(result, is(4));
    }

    /**
     * Test fourth = max
     */
    @Test
    public void whenMax7To3To3To6Then7() {
        Max max = new Max();
        int result = max.max(6, 3, 3, 7);
        assertThat(result, is(7));
    }

    /**
     * Test first = second = third = fourth
     */
    @Test
    public void whenMax9To9To9To9Then9() {
        Max max = new Max();
        int result = max.max(9, 9, 9, 9);
        assertThat(result, is(9));
    }
}
