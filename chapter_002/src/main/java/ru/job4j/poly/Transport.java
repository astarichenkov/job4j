package ru.job4j.poly;

public interface Transport {
    void run();

    void passengers(int quantity);

    double tuck(double liter);
}