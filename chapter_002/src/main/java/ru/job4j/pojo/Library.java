package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("Зайчик Сева обиделся!", 28);
        Book book2 = new Book("Зайчик Сева взял чужое!", 32);
        Book book3 = new Book("Зайчик Сева просит прощения!", 28);
        Book book4 = new Book("Clean code", 464);

        Book[] books = new Book[4];

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i <= 3; i++) {
            System.out.println(books[i].getName() + " " + books[i].getNumberOfPages());
        }
        System.out.println();

        Book swap = book1;
        books[0] = books[3];
        books[3] = swap;

        for (int i = 0; i <= 3; i++) {
            System.out.println(books[i].getName() + " " + books[i].getNumberOfPages());
        }
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " " + books[i].getNumberOfPages());
            }
        }


    }

}
