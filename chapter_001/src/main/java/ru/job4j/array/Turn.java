package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int finish = 0;
        if (array.length % 2 == 0) {
            finish = array.length / 2;
        } else {
            finish = (array.length - 1) / 2;
        }
        for (int index = 0; index < finish; index++) {
            int swap = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = swap;
        }
        return array;
    }
}