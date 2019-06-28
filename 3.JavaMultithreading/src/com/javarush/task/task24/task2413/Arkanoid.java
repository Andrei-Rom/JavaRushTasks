package com.javarush.task.task24.task2413;

import java.util.List;

public class Arkanoid {
    public static void main(String[] args) {
    }

    private Ball ball;
    private List<Brick> bricks;
    private Stand stand;
    public static Arkanoid game;

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private int width;
    private int height;

    public void run(){}

    public void move(){}

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Ball getBall() {
        return ball;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public Stand getStand() {
        return stand;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }
}
