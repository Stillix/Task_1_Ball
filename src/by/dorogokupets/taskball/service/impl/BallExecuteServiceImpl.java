package by.dorogokupets.taskball.service.impl;

import by.dorogokupets.taskball.entity.Ball;
import by.dorogokupets.taskball.service.BallExecuteService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BallExecuteServiceImpl implements BallExecuteService {
    private static Logger logger = LogManager.getLogger();

    @Override
    public double calculateWeightInBasket(Ball[] balls) {
        double totalWeight = 0;
        for (int i = 0; i < balls.length; i++) {
            Ball ball = balls[i];
            totalWeight += ball.getWeight();
        }
        String formatted = String.format("%.3f", totalWeight);
        logger.info("Вес мячей в корзине равен " + formatted);
        return totalWeight;
    }

    @Override
    public int findCountBallByColor(Ball[] balls, String color) {
        int ballCount = 0;
        for (int i = 0; i < balls.length; i++) {
            if (balls[i].getColor().equalsIgnoreCase(color)) {
                ballCount++;
            }
        }
        logger.log(Level.INFO, "Получение мячей.Цвет:" + color + ". Количество мячей такого цвета: " + ballCount);
        return ballCount;
    }
}
