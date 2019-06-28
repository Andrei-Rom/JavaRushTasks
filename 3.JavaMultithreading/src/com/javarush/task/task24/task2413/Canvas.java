package com.javarush.task.task24.task2413;

public class Canvas {

    private int width;
    private int height;
    private char[][] matrix;

    public void setPoint(double x, double y, char c){
        int intX = (int) Math.round(x);
        int intY = (int) Math.round(y);
        if (intX >= 0 || intY >= 0 || intY < matrix.length || intX < matrix[0].length) matrix[intY][intX] = c;

    }

    public void drawMatrix(double x, double y, int[][] matrix, char c){
        for (int iy = 0; iy < matrix.length; iy++) {
            for (int jx = 0; jx < matrix[0].length; jx++) {
                if (matrix[iy][jx] != 0) setPoint(x+jx, y+iy, c);
            }
        }
    }

    public void clear(){
        this.matrix = new char[height + 2][width + 2];
    }
    
    public void print(){
        for (int iy = 0; iy < matrix.length; iy++) {
            for (int jx = 0; jx < matrix[0].length; jx++) {
                System.out.print(matrix[iy][jx]);
            }
            System.out.println();
        }
    }

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
}
