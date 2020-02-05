package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroup("2019-PE");
        student.setDateOfReceipt("01.09.2019");

        System.out.println("ФИО: " + student.getFullName());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Дата приема: " + student.getDateOfReceipt());
    }
}
