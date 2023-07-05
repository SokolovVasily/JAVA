package org.example.homework;

public class HW3 {
    public static void main(String[] args) {

        //1. Создайте строку через new - I study Basic Java!
        //2. Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
        String str = new String("I study Basic Java!");
        System.out.println(str);

        //3. Распечатать пред-последний символ строки. Используем метод String.charAt().
        char c = str.charAt(str.length()-2);
        System.out.println(c);
        //4. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

        boolean containsJava = str.contains("Java");
        System.out.println(containsJava);




        //5. Вырезать строку Java c помощью метода String.substring().
        String str2 = str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + "Java".length());
        System.out.println(str2);
        // другой вариант
        System.out.println(str.replace("Java", ""));


        //   String result = str.substring(12, 16);
        //   System.out.println(result);

        //   System.out.println(str.substring(0, 13));
        //    System.out.println(str.substring(str.length() -1));





        //6. Заменить все символы “а” на “о”.
        String replacedAtoO = str.replace('a', 'o');
        System.out.println(replacedAtoO);
        //7. Преобразуйте строку к верхнему регистру.
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
        //8. Преобразуйте строку к нижнему регистру.
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);

    }
}







