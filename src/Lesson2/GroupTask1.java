package Lesson2;

import java.util.Scanner;

/**
 * Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
 * которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */
public class GroupTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четное положительное число: ");
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("Вы ввели нечетное число. Попробуйте еще раз.");
            return;
        }
        System.out.println("Введите первый символ: ");
        char c1 = sc.next().charAt(0);
        System.out.println("Введите второй символ: ");
        char c2 = sc.next().charAt(0);
//        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(); // создание объекта класса StringBuilder для построения строки.
//        String sb = "";
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2); // добавление символа c1 в объект StringBuilder.
//            sb += c1;
//            sb += c2;
        }
        System.out.println(sb);
//        long end = System.currentTimeMillis();
//        long duration = end - start;
//        System.out.println("Время выполнения: " + duration + " миллисекунд");
    }
}
