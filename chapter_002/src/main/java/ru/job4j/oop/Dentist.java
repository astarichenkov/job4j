package ru.job4j.oop;

public class Dentist extends Doctor {
    private boolean prosthetist;

    public Dentist(String name, String surname, String education, String birthday,
                   String speciality, Boolean prosthetist) {
        super(name, surname, education, birthday, speciality);
        this.prosthetist = prosthetist;
    }

    public void pullOutTooth(Patient patient, int tooth) {
    }

    public void insertTheSeal(Patient patient, int tooth) {
    }
}
