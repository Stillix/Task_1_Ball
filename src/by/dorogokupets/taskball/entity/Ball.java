package by.dorogokupets.taskball.entity;

import java.util.Objects;
import java.util.StringJoiner;

public class Ball {
    private double weight;
    private String color;

    public Ball() {
    }

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 && Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ball.class.getSimpleName() + "[", "]")
                .toString();
    }
}
