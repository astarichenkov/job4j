package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int length = Math.min(left.length(), right.length());
        int rsl = 0;
        for (int i = 0; i < length; i++) {
            if (left.charAt(i) < right.charAt(i)) {
                rsl = -1;
                break;
            } else if (left.charAt(i) > right.charAt(i)) {
                rsl = 1;
                break;
            } else if (left.length() < right.length()) {
                rsl = -1;
            }
        }
        return rsl;
    }
}