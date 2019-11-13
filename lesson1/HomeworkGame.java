package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkGame {
    public static void main(String[] args) {
        char[][] grid = generateMap();
        char cursor = '@';
        int posX = 0;
        int posY = 0;
        int maxHealth = 40;
        int health = maxHealth;
        int healIncrement = 20;
        int bombIncrement = 20;
        String gameOverText = new String("");
        boolean endGame = false;
        grid[posY][posX] = cursor;
        while (!endGame) {

            Scanner in = new Scanner(System.in);
            for (char[] chars : grid) {
                System.out.println();
                for (int j = 0; j < grid.length; j++) {
                    System.out.print(chars[j] + " ");
                }
            }
            System.out.println(("\n\n" + health + "HP"));
            System.out.println(("---------------"));
            System.out.println(("Make you move"));
            String key = in.nextLine();
            grid[posY][posX] = '.';

            if (key.equals("s")) {
                posY++;
                if (posY > grid.length - 1) {
                    posY = 0;
                }
            }
            if (key.equals("d")) {
                posX++;
                if (posX > grid[posY].length - 1) {
                    posX = 0;
                }
            }
            if (key.equals("a")) {
                posX--;
                if (posX < 0) {
                    posX = grid[posY].length - 1;
                }
            }
            if (key.equals("w")) {
                posY--;
                if (posY < 0) {
                    posY = grid.length - 1;
                }
            }
            if (key.equals("exit")) {
                endGame = true;
            }

            if (grid[posY][posX] == '*') {
                if (health > bombIncrement) {
                    health = health - bombIncrement;
                } else {
                    endGame = true;
                    gameOverText = "WASTED ...";
                }
            }
            if (grid[posY][posX] == '+' && health < maxHealth) {
                health = health + healIncrement;
            }
            grid[posY][posX] = cursor;
            if (posY == grid.length - 1 && posX == grid[posY].length - 1) {
                endGame = true;
                gameOverText = "@@@ Congratulations!! You won! @@@";
            }
        }
        System.out.println(gameOverText);
    }

    public static char[][] generateMap() {
        char[][] grid = new char[10][10];
        for (int i = 0; i < grid.length; i++) {
            System.out.println();
            Arrays.fill(grid[i], '.');
            int bombPosition = 0;
            int healthPosition = 0;
            do {
                bombPosition = (int) (Math.random() * 10);
                healthPosition = (int) (Math.random() * 10);
            } while (bombPosition == healthPosition);
            grid[i][bombPosition] = '*';
            grid[i][healthPosition] = '+';
        }
        return grid;
    }

}
