package com.company;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {14, 19, 34, 45, 47, 56, 69, 85, 91, 111, 118};
        int x = scanner.nextInt();
        int left = 0;
        int right = a.length;
        int mid = left + (right - left) / 2;
        while (a[mid] != x && right != mid && left != mid) {
            if (a[mid] < x) {
                left = mid;
            }
            if (a[mid] > x) {
                right = mid;
            }
            mid = left + (right - left) / 2;
        }
        System.out.println("Найден искомый элемент массива" + " " + a[mid]);
    }
}






