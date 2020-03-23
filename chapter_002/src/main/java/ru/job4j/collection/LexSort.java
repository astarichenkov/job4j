package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String s1 = left.substring(0, left.indexOf("."));
        String s2 = right.substring(0, right.indexOf("."));
        return Integer.parseInt(s1) - Integer.parseInt(s2);
    }

}