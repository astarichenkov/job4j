package ru.job4j.oop;

public class Builder extends Engineer {
    private boolean lazyBuilder;

    public Builder(String name, String surname, String education, String birthday, String industrySector,
                   boolean lazyBuilder) {
        super(name, surname, education, birthday, industrySector);
        this.lazyBuilder = lazyBuilder;
    }


    public House build(Project project) {
        return new House();
    }
}
