package org.example.homework;

import java.util.Scanner;

public class HW7 {
          //Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
          //Числа могут быть, как целочисленные, так и дробные.
          //Например :
          //ввод : m=10.5, n=10.45
          //вывод: Число 10.45 ближе к 10.

            public static void main(String[] args) {
                double m = 10.5;
                double n = 10.45;

                double differenceM = Math.abs(m - 10); // Разница между m и 10
                double differenceN = Math.abs(n - 10); // Разница между n и 10

                if (differenceM < differenceN) {
                    System.out.println("Число " + m + " ближе к 10.");
                } else if (differenceN < differenceM) {
                    System.out.println("Число " + n + " ближе к 10.");
                } else {
                    System.out.println("Числа " + m + " и " + n + " равноудалены от 10.");
                }
            }
      }

/*  другой способ

public class HW7 {
    public static void main(String[] args) {
        double m;
        double n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        m = scanner.nextDouble();

        System.out.println("Enter first number:");
        n = scanner.nextDouble();

        double diffM = m - 10;
        double diffN = n - 10;

        if (diffM < 0)
            diffM = -diffM;

        if (diffN < 0)
            diffN = -diffN;

        if (diffM < diffN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (diffN < diffM) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Оба числа равноудалены от 10.");
        }

        scanner.close();

        //  if (m > 10 && n > 10  && m < n) {


    }
}

 */