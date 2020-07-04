package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            list.add(random.nextInt());
        }
        List<Integer> result = list.stream().filter(
                Integer -> Integer > 0).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
