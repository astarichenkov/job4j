package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return calc(n - 1) * n;
    }

    public static void main(String[] args) {
        int rsl = calc(6);
        System.out.println(rsl);
    }
}