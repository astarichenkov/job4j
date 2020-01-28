package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then1() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2ThenEqual() {
        int result = Max.max(10, 10);
        assertThat(result, is(10));
    }

    @Test
    public void when3numbers() {
        int result = Max.max(10, 15, 11);
        assertThat(result, is(15));
    }

    @Test
    public void when4numbers() {
        int result = Max.max(10, -2, 5, 4);
        assertThat(result, is(10));
    }
}