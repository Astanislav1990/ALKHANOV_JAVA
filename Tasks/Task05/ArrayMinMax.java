package com.company;
import java.util.Random;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(100);

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min> array[i])
                min = array[i];
        }
        System.out.println(" \n min = " + min);
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]  )
                max = array[i];
        }
        System.out.println(" \n max = " + max);
    }

}

