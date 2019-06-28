package com.javarush.task.task24.task2413;

public class Stand extends BaseObject  {

    private double speed;
    private double direction;

    public Stand(double x, double y) {
        super(x, y, 3);
        this.speed = 1;
        this.direction = 0;
    }

    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    public void moveLeft(){
        direction = -1;
    }

    public void moveRight(){
        direction = 1;
    }

    @Override
    public void move() {
        x = x + direction * speed;
    }

    @Override
    public boolean isIntersec(BaseObject o) {
        return super.isIntersec(o);
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    @Override
    public void setX(double x) {
        super.setX(x);
    }

    @Override
    public void setY(double y) {
        super.setY(y);
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }
}
