package by.dorogokupets.taskball.service;


import by.dorogokupets.taskball.entity.Basket;


public interface BallExecuteService {
    double calculateWeightInBasket(Basket basket);

    int findCountBallByColor(Basket basket, String color);
}
