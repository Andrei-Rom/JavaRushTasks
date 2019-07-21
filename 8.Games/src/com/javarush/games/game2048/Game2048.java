package com.javarush.games.game2048;

import com.javarush.engine.cell.*;


public class Game2048 extends Game {

    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        drawScene();
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                setCellColoredNumber(i, j, gameField[j][i]);
            }
        }

    }

    private void createNewNumber() {
        if (getMaxTileValue() == 2048) {
            win();
        }

        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        int n = getRandomNumber(10);

        if (gameField[x][y] == 0) {
            if (n == 9) {
                gameField[x][y] = 4;
            } else {
                gameField[x][y] = 2;
            }
        } else {
            createNewNumber();
        }
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.BLACK;
            case 2:
                return Color.SLATEGREY;
            case 4:
                return Color.LIGHTSLATEGREY;
            case 8:
                return Color.LIGHTGREY;
            case 16:
                return Color.GREY;
            case 32:
                return Color.DIMGREY;
            case 64:
                return Color.DARKSLATEGREY;
            case 128:
                return Color.DARKGRAY;
            case 256:
                return Color.NAVY;
            case 512:
                return Color.DARKSEAGREEN;
            case 1024:
                return Color.DARKSALMON;
            case 2048:
                return Color.FORESTGREEN;
        }
        return null;
    }

    private void setCellColoredNumber(int x, int y, int value) {
        if (value != 0) {
            setCellValueEx(x, y, getColorByValue(value), String.valueOf(value));
        } else setCellValueEx(x, y, getColorByValue(value), "");
    }

    private boolean compressRow(int[] row) {
        boolean flag = false;
        for (int i = row.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (row[j] == 0 && row[j] != row[j + 1]) {
                    int temp = row[j];
                    row[j] = row[j + 1];
                    row[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return flag;
    }

    private boolean mergeRow(int[] row) {
        boolean flag = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && row[i] == row[i + 1]) {
                row[i] *= 2;
                score = score + row[i];
                setScore(score);
                row[i + 1] = 0;
                flag = true;
                i++;
            }
        }
        return flag;
    }

    private void moveLeft() {
        int flag = 0;
        for (int i = 0; i < SIDE; i++) {
            if (compressRow(gameField[i])) flag++;
        }
        for (int i = 0; i < SIDE; i++) {
            if (mergeRow(gameField[i])) flag++;
        }
        for (int i = 0; i < SIDE; i++) {
            if (compressRow(gameField[i])) flag++;
        }
        if (flag > 0) {
            createNewNumber();
        }
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {
        int[][] rezult = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                rezult[i][j] = gameField[SIDE - j - 1][i];
            }
        }
        gameField = rezult;
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                isGameStopped = false;
                setScore(score = 0);
                createGame();
                drawScene();
            }
        } else {
            if (!canUserMove()) {
                gameOver();
            } else {
                if (key == Key.LEFT) {
                    moveLeft();
                    drawScene();
                } else if (key == Key.RIGHT) {
                    moveRight();
                    drawScene();
                } else if (key == Key.UP) {
                    moveUp();
                    drawScene();
                } else if (key == Key.DOWN) {
                    moveDown();
                    drawScene();
                }
            }
        }
    }

    private int getMaxTileValue() {
        int maxTileValue = 0;
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (gameField[j][i] > maxTileValue) {
                    maxTileValue = gameField[j][i];
                }
            }
        }
        return maxTileValue;
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.FIREBRICK, "Win Game!", Color.NAVY, 25);
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.FIREBRICK, "Game Over!", Color.NAVY, 25);
    }

    private boolean canUserMove() {
        int countZero = 0;
        int countMove = 0;
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (gameField[j][i] == 0) {
                    countZero++;
                }
            }
        }
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE - 1; j++) {
                if (gameField[j][i] == gameField[j + 1][i]) {
                    countMove++;
                }
            }
        }
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE - 1; j++) {
                if (gameField[i][j] == gameField[i][j + 1]) {
                    countMove++;
                }
            }
        }
        if (countZero > 0 || countMove > 0) {
            return true;
        } else {
            return false;
        }
    }
}
