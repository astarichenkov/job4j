package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(ball);
        ball.reply(hare);
        wolf.tryEat(ball);
        ball.reply(wolf);
        fox.tryEat(ball);
        ball.reply(fox);
        fox.tryEat2(ball);
        ball.reply(fox);
        fox.tryEat3(ball);
        ball.dies();



    }

}
