package org.example.homework;
import java.util.Random;
public class HW10 { // Задача 1 от 13.07
    public static void main(String[] args) {
        int[] array = new int[8]; // задаем массив из 8 элем
        Random random = new Random();

        // Заполняем его случайными целыми числами от 1 до 50
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }

        // Вывод исходного массива на консоль
        System.out.print("Исходный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Замена элементов с нечетным индексом на ноль
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        // Вывод "нового - измененн" массива на консоль
        System.out.print("Массив после замены: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
/*
Создайте массив из 8 случайных целых чисел из интервала [1;50]
Выведите массив на консоль в строку.
Замените каждый элемент с нечетным индексом на ноль.
Снова выведете массив на консоль в отдельной строке.

 */