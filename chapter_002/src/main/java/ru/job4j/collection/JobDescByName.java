package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        System.out.println(o2.getName().compareTo(o1.getName()));
        return o2.getName().compareTo(o1.getName());
    }
}