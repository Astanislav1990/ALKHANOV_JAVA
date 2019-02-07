package ALKHANOV;

import java.util.Scanner;

/**
 * Created by Админ on 07.02.2019.
 */
public class LostNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sumOfAllNum = 0;
        int sumOfNotAllNum = 0;
        int LostNum;

        for (int i = 1; i<=1000; i++) {
            sumOfAllNum = sumOfAllNum + i;
        }
        for (int i = 1; i < 1000; i++) {
            number = scanner.nextInt();
            sumOfNotAllNum = sumOfNotAllNum + number;
        }

        LostNum = sumOfAllNum - sumOfNotAllNum;
        System.out.println( LostNum);
    }
}


