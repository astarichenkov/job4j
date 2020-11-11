package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    start += "/" + el;
                }
                tmp.add(start);
            }
        }
        System.out.println(tmp);
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Comparator comparator = new DepDescComp();
        System.out.println(orgs);
        Collections.sort(orgs, comparator);
        System.out.println(orgs);
    }
}