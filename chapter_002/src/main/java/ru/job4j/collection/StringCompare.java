package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int length = Math.min(left.length(), right.length());
        int rsl = Integer.compare(left.length(), right.length());
        for (int i = 0; i < length; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                rsl = left.charAt(i) < right.charAt(i) ? -1 : 1;
                break;
            }
        }
        return rsl;
    }
}