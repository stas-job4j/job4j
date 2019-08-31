package ru.job4j;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    @Test
    public void whenMax9To7To3To5() {
        int expected = 9;
        int result = SqMax.max(7, 5, 3, 9);
        assertThat(result, is(expected));
    }
    @Test
    public void whenMax1To0To0To0() {
        int expected = 1;
        int result = SqMax.max(1, 0, 0, 0);
        assertThat(result, is(expected));
    }
    @Test
    public void whenMax8To7To7To7() {
        int expected = 8;
        int result = SqMax.max(7, 8, 7, 7);
        assertThat(result, is(expected));
    }
    @Test
    public void whenMax4To3To2To1() {
        int expected = 4;
        int result = SqMax.max(2, 3, 4, 1);
        assertThat(result, is(expected));
    }
    @Test
    public void whenMax5To3To4To1() {
        int expected = 5;
        int result = SqMax.max(4, 3, 5, 1);
        assertThat(result, is(expected));
    }
}
