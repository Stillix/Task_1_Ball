package by.dorogokupets.taskball.test;

import by.dorogokupets.taskball.entity.Ball;
import by.dorogokupets.taskball.entity.Basket;
import by.dorogokupets.taskball.service.impl.BallExecuteServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BallExecuteServiceTest {


    @Test
    void calculateWeightInBasket() {
        double expected = 4.4;
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
        double actual = ballExecuteService.calculateWeightInBasket(basket);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findCountBallByColor() {
        int expected = 1;
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
        int actual = ballExecuteService.findCountBallByColor(basket, "синий");
        Assertions.assertEquals(expected, actual);
    }
}