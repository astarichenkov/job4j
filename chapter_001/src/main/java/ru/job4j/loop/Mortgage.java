package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double remains = amount;
        while (remains > 0) {
            remains += remains * percent / 100;
            remains -= salary;
            year++;
        }
        return year;
    }
}