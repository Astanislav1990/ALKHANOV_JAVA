package ALKHANOV;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numbersCount = scanner.nextInt();
        int threadsCount = scanner.nextInt();

        int sumOfArray = 0;

        // TODO: генерируете массив чисел
        int arrayNumbers[] = new int[numbersCount];
        for (int i = 0; i < numbersCount; i++) {
            arrayNumbers[i] = random.nextInt(1000);
            sumOfArray += arrayNumbers[i];
        }
        // TODO: выводите их сумму
        System.out.println("Сумма чисел в массиве = " + " " + sumOfArray);

        // TODO: создаете массив потоков
        Counter threadsCounter[] = new Counter[threadsCount];
        // TODO: каждому потоку назначете свой участок
        int from = 0;
        int to = numbersCount / threadsCount;
               for (int i = 0, partOf = to; i < threadsCount; i++) {
            threadsCounter[i] = new Counter(from, to, arrayNumbers);
            from += partOf;
            to += partOf;
        }

        // TODO: запускаете каждый поток
        for (int i = 0; i < threadsCount; i++) {
            threadsCounter[i].start();
            threadsCounter[i].join();
            System.out.println(threadsCounter[i].getSumResult());
        }
        // TODO: здесь у каждого потока берете sumResult и складываете, смотрите результат.
        int sumOfThread = 0;
        for (int i = 0; i < threadsCount; i++) {
            sumOfThread += threadsCounter[i].getSumResult();
        }

        System.out.println("Сумма элементов из массива потоков = " + " " + sumOfThread);


    }
}
