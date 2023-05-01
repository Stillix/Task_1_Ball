package by.dorogokupets.taskball.test;

import by.dorogokupets.taskball.entity.Ball;
import by.dorogokupets.taskball.entity.Basket;
import by.dorogokupets.taskball.service.impl.BallExecuteServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BallExecuteServiceTest {


    @Test
    void calculateWeightInBasket() {
        double expected = 13.6;
        Ball[] balls = new Ball[6];
        balls[0] = new Ball(2, "зеленый");
        balls[1] = new Ball(2.2, "красный");
        balls[2] = new Ball(2.3, "синий");
        balls[3] = new Ball(2, "зеленый");
        balls[4] = new Ball(2.5, "зеленый");
        balls[5] = new Ball(2.4, "желтый");
        BallExecuteServiceImpl ballExecuteService = new BallExecuteServiceImpl();
        double actual = ballExecuteService.calculateWeightInBasket(balls);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findCountBallByColor() {
        int expected = 3;
        Ball[] balls = new Ball[6];
        balls[0] = new Ball(2.1, "зеленый");
        balls[1] = new Ball(2.2, "красный");
        balls[2] = new Ball(2.3, "синий");
        balls[3] = new Ball(2.2, "зеленый");
        balls[4] = new Ball(2.5, "зеленый");
        balls[5] = new Ball(2.4, "желтый");
        BallExecuteServiceImpl ballExecuteService = new BallExecuteServiceImpl();
        int actual = ballExecuteService.findCountBallByColor(balls, "Зеленый");
        Assertions.assertEquals(expected, actual);
    }
}