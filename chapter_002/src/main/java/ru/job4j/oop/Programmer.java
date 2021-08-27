package ru.job4j.oop;

public class Programmer extends Engineer {

    public Program develop(Project project) {
        return new Program();
    }

    public String[] develop(Task task) {
        return new String[100];
    }
}
