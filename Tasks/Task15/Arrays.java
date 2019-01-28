package com.company;

/**
 * Created by Админ on 21.01.2019.
 */
public class Arrays {

    public static void AddtoEnd(int [] a, int n) {
        int end = 0;
        for (int i = 0 ; i < a.length ; i++) {
           if (a[i] != 0){
               end ++;
           }
        }
        a[end] = n;
    }

   public static void AddtoBegin(int [] a, int n){
        int begin;
        for (int i = 0; i <a.length; i++){
            begin = a[i];
            a [i] = n ;
            n = begin;
        }
    }

    public static void DeleteFromPos(int[] a,int pos) {
        for (int i = pos; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
        }

    public static void AddByPos(int[] a,int pos, int n) {
        for (int i = pos; i <a.length  ; i++) {
                pos = a[i];
                a[i] = n;
                n = pos;
        }
    }

    public static void print (int a[]){
        for (int i = 0; i<a.length; i++){
            System.out.print( a[i] + " " );

        }
    }


    public static void main(String[] args) {
        int a[] = new int[6];
        a[0]= -3;
        a[1]= 4;
        AddtoEnd(a,5);
        print(a);
        AddtoBegin( a,1 );
        print( a);
        AddByPos(a,3, 7);
        print(a);
        DeleteFromPos(a,2);
        print(a);

    }
}
