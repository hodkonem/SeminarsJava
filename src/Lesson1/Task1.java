package Lesson1;

import java.util.Scanner;

/**
 * @author Mikhail Latypov
 * <p>
 * Вычислить n-е треугольного число (сумма чисел от 1 до n), n! (произведение от 1 до n)
 * 1 + 2 + 3 1 * 2 * 3
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число n: ");

        int n = console.nextInt();
        int tN = calculateTheNumberTn(n); // В методе main создал две переменные для использования результатов работы
        // методов calculateTheNumberTn и calculateFactorial
        int factorial = calculateFactorial(n);
        System.out.println("n-е треугольное число равно: " + tN + ",а факториал числа n равен " + factorial);
    }

    // метод, который вычисляет n-е треугольное число
    public static int calculateTheNumberTn(int n) {
        return n * (n + 1) / 2;
    }

    // метод для нахождения факториала
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
