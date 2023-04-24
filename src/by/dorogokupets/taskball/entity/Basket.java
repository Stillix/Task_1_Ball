package by.dorogokupets.taskball.entity;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public Basket() {
        this.balls = new ArrayList<Ball>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }
}
