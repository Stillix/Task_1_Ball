package by.dorogokupets.taskball.service.impl;

import by.dorogokupets.taskball.entity.Ball;
import by.dorogokupets.taskball.entity.Basket;
import by.dorogokupets.taskball.service.BallExecuteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class BallExecuteServiceImpl implements BallExecuteService {
    private static Logger logger = LogManager.getLogger();
    @Override
    public double calculateWeightInBasket(Basket basket) {
        double totalWeight = 0;
        ArrayList<Ball> balls = basket.getBalls();
        for (int i = 0; i < balls.size(); i++) {
            Ball ball = balls.get(i);
            double weight = ball.getWeight();
            totalWeight += weight;
        }
        return totalWeight;
    }

    @Override
    public int findCountBallByColor(Basket basket, String color) {
        int ballCount = 0;
        List<Ball> balls = basket.getBalls();
        for (int i = 0; i < balls.size(); i++) {
            if (balls.get(i).getColor().equalsIgnoreCase(color)) {
                ballCount++;
            }
        }
        return ballCount;
    }
}
