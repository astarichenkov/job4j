package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String s1 = "";
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) >= '0' && left.charAt(i) <= '9') {
                s1 += left.charAt(i);
            } else if (left.charAt(i) == '.') {
                break;
            }
        }
        String s2 = "";
        for (int i = 0; i < right.length(); i++) {
            if (right.charAt(i) >= '0' && right.charAt(i) <= '9') {
                s2 += right.charAt(i);
            } else if (right.charAt(i) == '.') {
                break;
            }
        }
        return Integer.parseInt(s1) - Integer.parseInt(s2);
    }

}