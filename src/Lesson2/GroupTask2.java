package Lesson2;

import java.util.Scanner;

/**
 * Напишите метод, который сжимает строку.
 * Ввод: aaaabbbcdd.
 * Вывод: a4b3cd2
 */

public class GroupTask2 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String compressedStr = compressString(str); // сохраняем сжатую строку в переменную
        System.out.println(compressedStr); // выводим сжатую строку в консоль
    }


    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        return compressed.toString();
    }

}
