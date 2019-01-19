package com.company;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char str[] = scanner.nextLine().toCharArray();
        char str2[] = scanner.nextLine().toCharArray();
        //int index = 0;
        int x = 0;
        int x1 = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == str2[0]) {
                //index = i;
                for (int j = 0; j < str2.length; j++) {
                     x += (int) str[i + j];
                     x1 += (int) str2[j];
                }
                if (x == x1) {
                    System.out.println("Совпадение");
                }
                return;
            }
        }
    }
}
