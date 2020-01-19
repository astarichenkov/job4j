package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = SqMax.max(5, 6, 2,1);
        assertThat(result, is(6));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = SqMax.max(5, 4, 2,1);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = SqMax.max(5, 4, 11,1);
        assertThat(result, is(11));
    }

    @Test
    public void whenForthMax() {
        MultiMax check = new MultiMax();
        int result = SqMax.max(5, 4, 2,8);
        assertThat(result, is(8));
    }

    @Test
    public void whenEquals() {
        MultiMax check = new MultiMax();
        int result = SqMax.max(5, 5, 5,5);
        assertThat(result, is(5));
    }
}
