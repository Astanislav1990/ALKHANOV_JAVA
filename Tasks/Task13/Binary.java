package com.company;

public class Binary<i> {

    public static int calc(int num){
        for(int i = 1; i<20000; i++){
        num = num / 2;
        if (num == 0) {
            return i;
        }
    }
        return-1;
}

    public static int toBinary(int n) {
        int a[] = new int[calc(n)];
        int temp;

        for (int i = 0; i < a.length; i++) {
            if (n != 0 || n != 1) {
                a[i] = n % 2;
                n = n / 2;
                //System.out.print(a[i] + " ");
            }

        }
        for (int j = 0; j < a.length / 2; j++) {
            temp = a[a.length - j - 1];
            a[a.length - j - 1] = a[j];
            a[j] = temp;
        }

        for (int j = 0; j < a.length; j++) {
            System.out.print("  " + a[j] + " ");

        }
        return n;
    }

    public static void main(String[] args) {
         toBinary(15000);
    }
}

