package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(o1.split("/")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(o2.split("/")));
        String el1 = list1.get(0);
        String el2 = list1.get(0);
        int rsl = el1.compareTo(el2);
        if (rsl != 0) {
            return rsl;
        } else {
            return o1.compareTo(o2);
        }
    }
}