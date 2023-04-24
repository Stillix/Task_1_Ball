package by.dorogokupets.main;


import by.dorogokupets.entity.Ball;
import by.dorogokupets.entity.Basket;
import by.dorogokupets.service.impl.BallExecuteServiceImpl;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Ball ball = new Ball(1.1, "красный");
        Ball ball2 = new Ball(1.1, "зеленый");
        Ball ball3 = new Ball(1.1, "синий");
        Ball ball4 = new Ball(1.1, "зеленый");
        basket.addBall(ball);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(ball4);
        BallExecuteServiceImpl ballExecuteService = new BallExecuteServiceImpl();
        System.out.println(ballExecuteService.calculateWeightInBasket(basket));
        System.out.println(ballExecuteService.findCountBallByColor(basket, "Синий"));


    }
}
