package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(e -> e.getSubjects().stream()).mapToInt(Subject::getScore).average().orElse(0);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(e -> new Tuple(e.getName(), e.getSubjects().stream().mapToInt(Subject::getScore).average().orElse(0))).collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        stream.flatMap(e -> e.getSubjects().stream().collect(Collectors.groupingBy(e.getName(), Collectors.averagingDouble(e.getSubjects().stream().mapToDouble(Subject::getScore)))));

        return List.of();
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        Comparator comparator = Comparator.comparing(Subject::getScore);
        return (Tuple) stream.map(e -> new Tuple(e.getName(), e.getSubjects().stream().mapToInt(Subject::getScore).sum())).max(comparator).orElse(new Tuple("", 0.0));
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}