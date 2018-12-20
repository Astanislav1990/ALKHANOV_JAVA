import java.util.Scanner;

/**
 * Created by Админ on 18.12.2018.
 */

class CompositionOfposition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();
        int compositionofNum = 1;
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
            // определяем простое число или нет
            for (int divider = 2; divider * divider <= digitsSum; divider++) {
                if (digitsSum % divider != 0) {
                    System.out.println("Prime");

                    //считаем произведение входных позиций чисел
                    compositionofNum = compositionofNum *  positionofNum;
                    positionofNum++;
                }
                currentNumber = scanner.nextInt();
            }
            System.out.println("compositionofNum = " + compositionofNum);
        }
    }
}







