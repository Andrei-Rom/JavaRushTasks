package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {

    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen;

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.direction = direction;
        this.speed = speed;
        isFrozen = true;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint (x, y, 'O');
    }

    @Override
    public void move() {
        if (!isFrozen) {
            x += dx;
            y += dy;
        }

    }

    public void start(){
        isFrozen = false;
    }

    public void setDirection (double direction){
        this.direction = direction;
        double angle = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
    }

    void checkRebound(int minx, int maxx, int miny, int maxy){}

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

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
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
