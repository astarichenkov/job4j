package ru.job4j.oop;

public class Predator extends Animal {
    public Predator() {
        super("Predator");
        System.out.println("Predator");
    }

    public Predator(String name) {
        super(name);
    }
}
