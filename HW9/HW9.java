package org.example.homework;

public class HW9 {
    public static void main(String[] args) { // Задача 1 "Колбы"
        int temperature1 = 210; // температура первой колбы
        int temperature2 = 60;  //  температура  второй колбы

        boolean isWorking = temperature1 > 100 && temperature2 < 100;
        System.out.println("Device is working: " + isWorking); //"устройство работает"
    }
}
//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.





