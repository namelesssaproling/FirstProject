package dota.task6;

import java.util.Random;

public class task6_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[][]= new int[4][4];
        for(int x = 0;x< array.length;x++){
            for(int y = 0; y< array.length;y++){
                array[x][y]= random.nextInt(21);
            }
        }
        for(int x = 0;x< array.length;x++){
            for(int y = 0; y< array.length;y++){
                System.out.printf("%d ", array[x][y]);
            }
            System.out.println();
        }
    }
}
