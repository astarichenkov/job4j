package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TrgAreaTest {
    @Test
    public void square() {
        Point ap = new Point(0, 0);
        Point bp = new Point(2, 0);
        Point cp = new Point(0, 2);
        double expected = 1.99;
        TrgArea trgArea = new TrgArea(ap, bp, cp);
        double out = trgArea.area();
        Assert.assertEquals(expected, out, 0.01);
        System.out.println(out);
    }
}