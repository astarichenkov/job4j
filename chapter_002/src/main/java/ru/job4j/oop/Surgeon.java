package ru.job4j.oop;

public class Surgeon extends Doctor {
    private boolean neurosurgeon;

    public Surgeon(String name, String surname, String education, String birthday,
                   String speciality, boolean neurosurgeon) {
        super(name, surname, education, birthday, speciality);
        this.neurosurgeon = neurosurgeon;
    }

    public void operate(Patient patient) {

    }
}
