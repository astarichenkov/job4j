package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsMap {
    public Map<String, Student> getStudentsMap(ArrayList<Student> students) {
        return students.stream()
                .collect(
                        Collectors.toMap(
                                Student::getSurname,
                                student -> student
                        )
                );
    }
}
