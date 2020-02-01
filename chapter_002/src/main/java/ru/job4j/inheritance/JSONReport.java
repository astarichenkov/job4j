package ru.job4j.inheritance;

public class JSONReport extends HtmlReport {


    @Override
    public String generate(String name, String body) {
        return "name : " + name
                + "\nbody : " + body;
    }


    public static void main(String[] args) {
        System.out.println(new JSONReport().generate("Name", "Body"));
    }
}
