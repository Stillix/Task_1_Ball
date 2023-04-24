package by.dorogokupets.service;


import by.dorogokupets.entity.Basket;


public interface BallExecuteService {
    double calculateWeightInBasket(Basket basket);

    int findCountBallByColor(Basket basket, String color);
}
