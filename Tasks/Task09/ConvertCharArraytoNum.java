package com.company;

import java.util.Scanner;

public class ConvertCharArraytoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a[] = scanner.nextLine().toCharArray();
        for (int i = 0; i < a.length; i++) {
             int  x =(int) a[i] - '0';
               System.out.print (x);
        }
    }
}



