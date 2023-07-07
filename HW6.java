package org.example.homework;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        addition();
        substaction();
        multiplacation();
        divide();
    }
    static void addition() {
        Scanner scanner = new  Scanner (System.in);
        System.out.println("введи число 1");
        int num1 = scanner.nextInt();
        System.out.println("введи число 2");
        int num2 = scanner.nextInt();
        System.out.println("Итого:");
        int sum =  num1 + num2;
        System.out.println(sum);

    }
    static void substaction() {
        Scanner scanner = new  Scanner (System.in);
        System.out.println("введи число  1");
        int num1 = scanner.nextInt();
        System.out.println("введи число  2");
        int num2 = scanner.nextInt();
        System.out.println("Итого:");
        int sum =  num1 - num2;
        System.out.println(sum);

    }
    static void multiplacation() {
        Scanner scanner = new  Scanner (System.in);
        System.out.println("введи число  1");
        int num1 = scanner.nextInt();
        System.out.println("введи число  2");
        int num2 = scanner.nextInt();
        System.out.println("Итого:");
        int sum =  num1 * num2;
        System.out.println(sum);

    }
    static void divide() {
        Scanner scanner = new  Scanner (System.in);
        System.out.println("введи число 1");
        int num1 = scanner.nextInt();
        System.out.println("введи число  2");
        int num2 = scanner.nextInt();
        System.out.println("Итого:");
        int sum =  num1 / num2;
        System.out.println(sum);

    }

}

