package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matches = 11;
        int player = 1;
        int quantity;
        while (matches > 0) {
            System.out.print("Игрок " + player + " берет спички: ");
            quantity = Integer.valueOf(in.nextLine());
            if (quantity < 1 || quantity > 3) {
                System.out.println("Задано неверное количество, осталось " + matches + " спичек");
                continue;
            }
            if (matches - quantity < 0) {
                System.out.println("Задано неверное количество, осталось " + matches + " спичек");
                continue;
            }
            matches -= quantity;
            if (matches == 0) {
                System.out.println("Выиграл игрок " + player);
            } else {
                System.out.println("Осталось " + matches + " спичек");
            }
            player = (player == 1) ? 2 : 1;
        }

    }
}
