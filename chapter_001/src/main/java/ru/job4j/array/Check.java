package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int i = 1; i < data.length; i++) {
            result = result && data[i];
        }
        return result;
    }
}