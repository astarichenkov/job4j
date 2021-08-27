package ru.job4j.oop;

public class Builder extends Engineer {

    public House build(Project project) {
        return new House();
    }
}
