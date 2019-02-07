package ALKHANOV;

/**
 * Created by Админ on 07.02.2019.
 */
class Expand {
    public static void main(String[] args) {
        int a [] = {3, 4, 5, 6, 7};
        int temp;
        for ( int i = 0; i< a.length/2 ; i++){
            temp = a [a.length-i-1];
            a [a.length-i-1] = a [i];
            a [i] = temp;
        }
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
