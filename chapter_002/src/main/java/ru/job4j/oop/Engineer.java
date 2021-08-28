package ru.job4j.oop;

public class Engineer extends Profession {
    private String industrySector;

    public Engineer(String name, String surname, String education, String birthday, String industrySector) {
        super(name, surname, education, birthday);
        this.industrySector = industrySector;
    }

    public Project design(Task task) {
        return new Project();
    }
}
