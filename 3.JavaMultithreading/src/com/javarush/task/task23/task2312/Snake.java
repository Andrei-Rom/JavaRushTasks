package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private ArrayList<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public Snake(int x, int y){
        this.sections = new ArrayList<>();
        this.isAlive = true;
        SnakeSection snakeSection = new SnakeSection(x, y);
        sections.add(snakeSection);
    }

    public int getX(){
        return sections.get(0).getX();
    }

    public int getY(){
        return sections.get(0).getY();
    }

    public void move(){
        if (isAlive) {
            switch (direction) {
                case UP : { move(0, -1);} break;
                case RIGHT : { move(1, 0); } break;
                case DOWN : { move(0, 1); } break;
                case LEFT : { move(-1, 0); } break;
            }
        }
    }

    public void move (int x, int y){
        SnakeSection head = sections.get(0);
        head = new SnakeSection(head.getX() + x, head.getY() + y);
        checkBody(head);
        if (!isAlive) return;
        checkBorders(head);
        if (!isAlive) return;

        Mouse mouse = Room.game.getMouse();
        if (head.getX() == mouse.getX() && head.getY() == mouse.getY()){
            sections.add(0, head);
            Room.game.eatMouse();
        }
        else {
            sections.add(0, head);
            sections.remove(sections.size() - 1);
        }
    }

    public void checkBorders(SnakeSection head){
        if(head.getX() < 0 || head.getY() < 0) isAlive = false;
        if (head.getX() >= Room.game.getWidth() || head.getY() >= Room.game.getHeight()) isAlive = false;
    }

    public void checkBody (SnakeSection head){
        if (sections.contains(head)) isAlive = false;
    }
}
