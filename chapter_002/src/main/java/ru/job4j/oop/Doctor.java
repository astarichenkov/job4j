package ru.job4j.oop;

public class Doctor extends Profession {

    public Diagnosis heal(Patient patient) {
        return new Diagnosis();
    }
}
