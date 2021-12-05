package dota.task6;

import java.util.Random;

public class task6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int array[][] = new int[5][];
        array[0]=new int[1];
        array[1]=new int[2];
        array[2]=new int[3];
        array[3]=new int[2];
        array[4]=new int[1];
        for(int x = 0;x <= array.length-1;x++){
            for(int y = 0; y !=array[x].length;y++){
                System.out.print(array[x][y]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int x = 0;x <= array.length-1;x++){
            for(int y = 0; y !=array[x].length;y++){
                array[x][y]= random.nextInt(10);
            }
        }
        for(int x = 0;x < array.length;x++){
            int a = 0;
            for(int y = 0; y < array[x].length;y++){
                a = a + array[x][y];
            }
            System.out.print(a);
            System.out.println();
        }
    }
}
