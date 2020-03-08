package ru.job4j.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        Paint paint = new Paint();
        paint.draw(square);
        System.out.println();
        System.out.println();
        paint.draw(triangle);
    }
}
