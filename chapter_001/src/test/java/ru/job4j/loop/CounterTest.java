

package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter check = new Counter();
        int start = 1;
        int finish = 10;
        int expected = 30;
        int out = check.add(start, finish);
        Assert.assertEquals(expected, out);
    }
}

