package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentsMapTest {
    @Test
    public void whenThreeStudents() {
        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(
                new Student("Baranov", 98),
                new Student("Evseeva", 81),
                new Student("Smolina", 87)));
        Map<String, Student> expected = new HashMap<>();
        expected.put("Baranov", new Student("Baranov", 98));
        expected.put("Evseeva", new Student("Evseeva", 81));
        expected.put("Smolina", new Student("Smolina", 87));
        StudentsMap studentsMap = new StudentsMap();
        Map<String, Student> result = studentsMap.getStudentsMap(students);
        assertThat(result, is(expected));
    }
}
