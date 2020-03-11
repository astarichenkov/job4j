package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.ex.Fact.calc;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void when0to2() {
        int rsl = calc(0);
        assertThat(rsl, is(2));
    }
}
