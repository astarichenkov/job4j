package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.function.Predicate;

public class SchoolTest {
    private ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(
            new Student("Petrov", 45),
            new Student("Boyarskiy", 51),
            new Student("Baranov", 98),
            new Student("Lozhkina", 65),
            new Student("Puzik", 66),
            new Student("Chelnokov", 60),
            new Student("Evseeva", 81),
            new Student("Bochkarev", 49),
            new Student("Smolina", 87),
            new Student("Kalinina", 40)));

    @Test
    public void whenGetClass10A() {
        ArrayList<Student> expected = new ArrayList<Student>(Arrays.asList(
                new Student("Baranov", 98),
                new Student("Evseeva", 81),
                new Student("Smolina", 87)));
        School school = new School();
        Predicate<Student> getClass10A = Student -> Student.getScore() >= 70;
        List<Student> result = school.collect(students, getClass10A);
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetClass10B() {
        ArrayList<Student> expected = new ArrayList<Student>(Arrays.asList(
                new Student("Boyarskiy", 51),
                new Student("Lozhkina", 65),
                new Student("Puzik", 66),
                new Student("Chelnokov", 60)));
        School school = new School();
        Predicate<Student> getClass10B = Student -> Student.getScore() >= 50
                && Student.getScore() < 70;
        List<Student> result = school.collect(students, getClass10B);
        assertThat(result, is(expected));
    }

    @Test
    public void whenGetClass10C() {
        ArrayList<Student> expected = new ArrayList<Student>(Arrays.asList(
                new Student("Petrov", 45),
                new Student("Bochkarev", 49),
                new Student("Kalinina", 40)));
        School school = new School();
        Predicate<Student> getClass10C = Student -> Student.getScore() < 50;
        List<Student> result = school.collect(students, getClass10C);
        assertThat(result, is(expected));
    }
}
