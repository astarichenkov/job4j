package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class MatrixToListTest {
    @Test
    public void whenMatrix3x4() {
        Integer[][] matrix = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        List<Integer> expected = Arrays.asList(5, 7, 3, 17, 7, 0, 1, 12, 8, 1, 2, 3);
        MatrixToList matrixToList = new MatrixToList();
        List<Integer> result = matrixToList.integerList(matrix);
        Assert.assertThat(result, is(expected));
    }
}
