package ALKHANOV;

import java.util.Scanner;

/**
 * Created by Админ on 07.02.2019.
 */
public class ProductOfposition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();
        int productofNum = 1;
        int positionofNum = 1;
        int currentDigit = 0;
        while (currentNumber != -1) {
            // считаем сумму цифр числа
            int digitsSum = 0;
            while (currentNumber != 0) {
                currentDigit = currentNumber % 10;
                digitsSum = digitsSum + currentDigit;
                System.out.println("digitsSum = " + digitsSum);
                currentNumber = currentNumber / 10;
            }
            if (digitsSum == 1) {
            }
            if (digitsSum == 2 || digitsSum == 3) {
                // произведение входных позиций чисел
                productofNum = productofNum * positionofNum;
                System.out.println("Prime");
            }
            // определяем cумму цифр простое число или нет
            for (int divider = 2; divider * divider <= digitsSum; divider++)
                if (digitsSum % divider != 0) {
                    System.out.println("Prime");
                    // произведение входных позиций чисел
                    productofNum = productofNum * positionofNum;
                }
            currentNumber = scanner.nextInt();
            positionofNum++;
        }
        System.out.println("productofNum = " + productofNum);
    }
}

