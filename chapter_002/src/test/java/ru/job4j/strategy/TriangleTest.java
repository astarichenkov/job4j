package ru.job4j.strategy;

import org.junit.Test;
import ru.job4j.strategy.Triangle;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TriangleTest {
    @Test
    public void whenDrawSquare() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+")
                                .add("+++")
                                .add("+++++")
                                .add("+++++++")
                                .add("+++++++++")
                                .add("+++++++++++")
                                .toString()
                )
        );
    }
}