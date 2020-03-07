package strategy;

import org.junit.Test;
import ru.job4j.strategy.Square;
import ru.job4j.strategy.Triangle;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+")
                                .add("+ +")
                                .add("+   +")
                                .add("+     +")
                                .add("+       +")
                                .add("+ + + + + +")
                                .toString()
                )
        );
    }
}