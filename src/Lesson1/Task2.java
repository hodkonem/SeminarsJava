package Lesson1;

/**
 * @author Mikhail Latypov
 * <p>
 * Вывести все просты числа от 1 до 1000
 */

// Для решени этой задачи надо использовать алгоритм проверки числен на простоту.
// Простое число - это натуральное число, которое имеет ровно два различных натуральных делителя: единицу и само себя.
// Например, числа 2, 3, 5, 7, 11 и т.д.

public class Task2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++ ) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}