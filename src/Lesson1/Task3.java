package Lesson1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Mikhail Latypov
 * <p>
 * Реализовать простой калькулятор (+-/*)
 * sc.next() - считывает 1 элемент
 * sc.nextInt() - считывает только число
 * sc.nextLine() - считывает строчку
 * Введите число: 4 \n
 * Введите знак:
 */

// Добавил в программу исключения на случай, если пользователь хочет поделить на 0 или введёт не число.
// В некоторых случаях было бы лучше double numUser1 и double numUser2 (чтобы не было целочисленного деления), но тогда было бы не по ТЗ.
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numUser1 = 0;
        int numUser2 = 0;
        String operation = "";
        int result = 0;

        try {
            System.out.println("Введите первое число: ");
            numUser1 = sc.nextInt();
            System.out.println("Введите арифметический знак (+, -, *, /): ");
            operation = sc.next();
            System.out.println("Введите второе число: ");
            numUser2 = sc.nextInt();
            switch (operation) {
                case "+":
                    result = numUser1 + numUser2;
                    break;
                case "-":
                    result = numUser1 - numUser2;
                    break;
                case "*":
                    result = numUser1 * numUser2;
                    break;
                case "/":
                    if (numUser2 == 0) {
                        throw new ArithmeticException("Ошибка: деление на ноль");
                    }
                    result = numUser1 / numUser2;
                    break;
                default:
                    throw new IllegalArgumentException(" неверный знак операции");
            }
            System.out.println("Результат: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено неверное значение");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
