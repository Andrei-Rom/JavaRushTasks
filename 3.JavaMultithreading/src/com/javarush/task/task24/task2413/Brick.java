package com.javarush.task.task24.task2413;

public class Brick extends BaseObject  {
    public Brick(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {

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
