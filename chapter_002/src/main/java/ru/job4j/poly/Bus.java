package ru.job4j.poly;

public class Bus implements Transport {
    public boolean isRun = false;
    public int numberOfPassengers = 0;

    @Override
    public void run() {
        this.isRun = true;
    }

    @Override
    public void passengers(int quantity) {
        this.numberOfPassengers = quantity;
    }

    @Override
    public double tuck(double liter) {
        double price = liter * 45.5;
        return price;
    }
}
