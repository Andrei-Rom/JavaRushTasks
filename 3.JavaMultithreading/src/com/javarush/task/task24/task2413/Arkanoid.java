package com.javarush.task.task24.task2413;

import java.util.ArrayList;
import java.util.List;

public class Arkanoid {
    public static void main(String[] args) {
    }

    private Ball ball;
    private List<Brick> bricks;
    private Stand stand;
    public static Arkanoid game;
    private boolean isGameOver;
    
    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private int width;
    private int height;

    public void run(){}

    public void move(){
        ball.move();
        stand.move();
    }

    public void checkBricksBump(){
        for (Brick brick : new ArrayList<Brick>(bricks)) {
            if (ball.isIntersec(brick)) {
                double angle = Math.random() * 360;
                ball.setDirection(angle);
                bricks.remove(brick);
            }
        }
    }

    public void checkStandBump(){
        if (ball.isIntersec(stand)){
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    public void checkEndGame(){
        if (ball.getY() > height){
            isGameOver = true;
        }
    }

    public void draw(Canvas canvas) {
        ball.draw(canvas);
        stand.draw(canvas);
        for (Brick brick : bricks) {
            brick.draw(canvas);
        }
    }

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
