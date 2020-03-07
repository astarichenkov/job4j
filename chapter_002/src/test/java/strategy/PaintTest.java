package strategy;

import org.junit.Test;
import ru.job4j.strategy.Paint;
import ru.job4j.strategy.Square;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+ + + + +")
                                .add("+ +     +")
                                .add("+  +    +")
                                .add("+   +   +")
                                .add("+    +  +")
                                .add("+ + + + +")
//                                .add(System.lineSeparator())
//                                .add("\r\n")
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}