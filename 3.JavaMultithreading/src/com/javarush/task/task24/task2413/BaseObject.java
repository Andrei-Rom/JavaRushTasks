package com.javarush.task.task24.task2413;

public abstract class BaseObject {

    private double x;
    private double y;
    private double radius;

    public abstract void draw (Canvas canvas);

    public abstract void move();

    public boolean isIntersec(BaseObject o){
        double dX = this.getX() - o.getX();
        double dY = this.getY() - o.getY();
        double diatance = Math.sqrt(dX * dX + dY * dY);
        double Mindiatance = Math.max(radius, o.radius);
        return (diatance <= Mindiatance);
    }

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
