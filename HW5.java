package org.example.homework;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово");

        String firstWord = scanner.nextLine();
        System.out.println("Введите второе слово");

        String secondWord = scanner.nextLine();
        if (firstWord.length() % 2 !=0) {
            System.err.println("Первое слово введенное нечетное");
        } else if (secondWord.length() % 2 !=0) {
            System.err.println("Второе слово введенное нечетное");
        } else {
            System.out.println(
                    cutTwoWordInHalfAndMerge(firstWord,secondWord)
            );

        }
    }
    public static String cutTwoWordInHalfAndMerge(String firstWord,String secondWord) {
        String firstHalf = firstWord.substring(0,firstWord.length()/2);

        String secondHalf = secondWord.substring(secondWord.length() / 2);
        return firstHalf + secondHalf;
    }
}
