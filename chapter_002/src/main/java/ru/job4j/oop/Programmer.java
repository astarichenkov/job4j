package ru.job4j.oop;

public class Programmer extends Engineer {
    private String grade;

    public Programmer(String name, String surname, String education, String birthday, String industrySector,
                      String grade) {
        super(name, surname, education, birthday, industrySector);
        this.grade = grade;
    }

    public Program develop(Project project) {
        return new Program();
    }

    public String[] develop(Task task) {
        return new String[100];
    }
}
