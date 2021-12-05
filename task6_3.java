package dota.task6;

import java.util.Random;
import java.util.Scanner;

public class task6_3 {
    public static void Cheat(int[][] array, int h, int w) {
        for (int x = 0; x < h; x++) {
            for (int y = 0; y < w; y++) {
                System.out.print(array[x][y]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int[][] MinesRandom(int h, int w) {
        int[][] minesRandom = new int[h][w];
        Random random = new Random();
        for (int x = 0; x < h; x++) {
            for (int y = 0; y < w; y++) {
                minesRandom[x][y] = random.nextInt(2);
            }
        }
        return (minesRandom);
    }

    public static char[][] MinesView(int h, int w) {
        char[][] minesView = new char[h][w];
        for (int x = 0; x < h; x++) {
            for (int y = 0; y < w; y++) {
                minesView[x][y] = '*';
            }
        }
        return (minesView);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean Defeat = false;
        int h = in.nextInt();
        int w = in.nextInt();
        int minesRandom[][] = MinesRandom(h, w);
        char minesView[][] = MinesView(h, w);
        while (!Defeat) {
            for (int x = 0; x < h; x++) {
                for (int y = 0; y < w; y++) {
                    System.out.print(minesView[x][y]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            int a = in.nextInt();
            if (a == 10) {
                Cheat(minesRandom, h, w);
                a = in.nextInt();
            }
            int b = in.nextInt();
            if (minesRandom[a - 1][b - 1] == 0) {
                System.out.println("На этой клетке мины нет");
                minesView[a - 1][b - 1] = 'O';
            } else {
                System.out.println("Вы наступили на мину!");
                Defeat = true;
            }
        }
    }
}
