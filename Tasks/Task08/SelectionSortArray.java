package com.company;

public class SelectionSortArray {
    public static void main(String[] args) {
        int min;
        int index;
        int temp;
        int[] numbers = {2, 5, 7, 8, 3, 0};

        for (int i = 0; i < numbers.length - 1; i++) {
            // считаем, что начальный элемент является минимальным в массиве
            min = numbers[i];
            index = i;
            // проверяем массив, если в нем есть меньший элемент предполагаемого
            for (int scan = i + 1; scan < numbers.length; scan++) {
                // Если такой есть, то запоминаем его индекс и обновляем значение минимального
                if (numbers[scan] < min) {
                    min = numbers[scan];
                    index = scan;
                }
            }
            // проверка. если такой нашелся, то меняем элементы местами
            if (i != index) {
                temp = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = temp;
            }
            System.out.println(numbers[i] + " ");
        }

    }
}
