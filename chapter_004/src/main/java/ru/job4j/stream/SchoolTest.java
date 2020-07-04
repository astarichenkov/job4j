package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    private Predicate<Student> getClass10A() {
        return Student -> Student.getScore() >= 70;
    }

    private Predicate<Student> getClass10B() {
        return Student -> Student.getScore() >= 50 && Student.getScore() < 70;
    }

    private Predicate<Student> getClass10C() {
        return Student -> Student.getScore() < 50;
    }

    public static void main(String[] args) {
        School school = new School();
        SchoolTest schoolTest = new SchoolTest();
        List<Student> result = school.collect(schoolTest.getStudents(), schoolTest.getClass10A());
        result.forEach(System.out::println);
    }
}
