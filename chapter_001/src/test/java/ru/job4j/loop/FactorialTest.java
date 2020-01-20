

package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial check = new Factorial();
        int in = 5;
        int expected = 120;
        int out  = check.calc(in);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial check = new Factorial();
        int in = 0;
        int expected = 1;
        int out  = check.calc(in);
        Assert.assertEquals(expected,out);
    }
}

