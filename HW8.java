package org.example.homework;

import java.util.Scanner;

public class HW8 {
//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//Реализует логический метод canBuy,  возвращающий boolean
//Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.


        public static void main(String[] args) {
            boolean isEdekaOpen = true;  // Пример значения для переменной isEdekaOpen
            boolean isReweOpen = false; // Пример значения для переменной isReweOpen

            boolean canBuy = canBuyFood(isEdekaOpen, isReweOpen);

            String message = "Я могу купить еду, это " + (canBuy ? "возможно" : "невозможно");
            System.out.println(message);
        }

        public static boolean canBuyFood(boolean isEdekaOpen, boolean isReweOpen) {
            return isEdekaOpen || isReweOpen;
        }

    }









/*
    public class Shops {
        public static void main(String[] args) {
            int start1 , start2 , end1 , end2;
            start1 = 8;
            start2 = 12;
            end1 = 17;
            end2 = 22;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Который час: ");
            int hour = scanner.nextInt();
            boolean isEdekaOpen = edeka(start1, end1, hour);
            boolean isReweOpen = rewe(start2, end2, hour);


            if (hour < start1 || hour > end2) {
                System.out.println("Все магазины закрыты");
            } else System.out.println("Я могу купить еду, это: \n"
                    + "isEdekaOpen: " + isEdekaOpen
                    + "isReweOpen: " + isReweOpen);

        }
        static boolean edeka(int start1 , int end1, int hour) {
            boolean isEdekaOpen;
            if (hour >= start1 && hour < end1 ) {
                isEdekaOpen = true;
            } else {
                isEdekaOpen = false;
            }
            return isEdekaOpen;
        }
        static boolean rewe(int start2 , int end2, int hour) {
            boolean isReweOpen;
            if (hour >= start2 && hour < end2 ) {
                isReweOpen = true;
            } else {
                isReweOpen = false;
            }
            return isReweOpen;
        }
    }
}

 */
