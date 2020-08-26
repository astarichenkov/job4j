package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            ArrayList<String> list = new ArrayList<>(Arrays.asList(value.split("/")));
            for (String el : list) {
                tmp.add(el);
                if (el.startsWith("s")) {
                    tmp.add(el.substring(1));
                }
            }
        }
        ArrayList<String> tmpList = new ArrayList<>(tmp);
        Collections.sort(tmpList);
        ArrayList<String> result2 = new ArrayList<>();
        String str = "";
        for (int i = 0; i < tmp.size(); i++) {
            if (i != 0) {
                str = str + "/" + tmpList.get(i);
                result2.add(str);
            } else {
                str = tmpList.get(i);
                result2.add(str);
            }
        }

        return result2;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Comparator comparator = new DepDescComp();
        Collections.sort(orgs, comparator);
    }
}