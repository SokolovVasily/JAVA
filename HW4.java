package org.example.homework;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        //  Каждый метод принимает два числа в параметрах и возвращает результат
        //  Вызовите все методы в main
        //  Результат распечатайте в консоль
        float number1 ;
        float number2 ;

        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextFloat();
        //Действие
        int action;
        System.out.println("выберите действие: 1 for +, 2 for - , 3 for * , 4 for /");
        action = scanner.nextInt();


        System.out.println("ВВедите 2 число:");
        number2 = scanner.nextFloat();

//
        if (action == 1 ){
            System.out.println(addition(number1, number2));
        }

        if (action == 2){
            System.out.println (substruction(number1, number2));}

        if(action == 3) {
            System.out.println (multiplication(number1, number2));}

        if(action == 4) {
            System.out.println (divide(number1, number2));}


    }
    static float addition(float number1, float number2){
        float sum = number1 + number2;
        return sum;

    }
    static float substruction(float num1, float num2){
        float sum = num1 - num2;
        return sum;

    }

    static float multiplication(float num1, float num2){
        float sum = num1 * num2;
        return sum;

    }

    static float divide(float num1, float num2){
        float sum = num1 / num2;
        return sum;

    }
}



