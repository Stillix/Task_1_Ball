package by.dorogokupets.taskball.service;


import by.dorogokupets.taskball.entity.Ball;


public interface BallExecuteService {
    double calculateWeightInBasket(Ball[] balls);

    int findCountBallByColor(Ball[] balls, String color);
}
