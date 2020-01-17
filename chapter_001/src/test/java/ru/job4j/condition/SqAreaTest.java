package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int in1 = 8;
        int in2 = 3;
        double expected = 3;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected,out,0.01);
        System.out.println(out);
    }
}
