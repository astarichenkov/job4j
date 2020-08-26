package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(o1.split("/")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(o2.split("/")));
        while (list1.size() < 3) {
            list1.add("");
        }
        while (list2.size() < 3) {
            list2.add("");
        }
        if (list1.get(0).compareTo(list2.get(0)) != 0) {
            return list2.get(0).compareTo(list1.get(0));
        }
        if (list1.get(1).compareTo(list2.get(1)) != 0) {
            return list1.get(1).compareTo(list2.get(1));
        }
        if (list1.get(2).compareTo(list2.get(2)) != 0) {
            return list1.get(2).compareTo(list2.get(2));
        }
        return 0;
    }
}