package org.example.homework;
import java.util.Random;
public class HW10_1 { // Задача 2 от 13-07
    public static void main(String[] args) {
        int[] array = generateRandomArray(5, 10, 99);

        System.out.print("Сгенерированный массив: ");
        printArray(array);

        boolean isIncreasing = checkIncreasing(array);//проверкаУвеличения
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }

    public static int[] generateRandomArray(int length, int minValue, int maxValue) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static boolean checkIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
/*
Создайте массив из 5 случайных целых чисел из интервала [10;99]
Выведите его на консоль в строку.
Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

 */