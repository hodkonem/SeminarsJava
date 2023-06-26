package Lesson3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Mikhail Latypov
 * <p>
 * Задание
 * <p>
 * Пусть дан произвольный список целых чисел.
 * <p>
 * 1) Нужно удалить из него чётные числа
 * 2) Найти минимальное значение
 * 3) Найти максимальное значение
 * 4) Найти среднее ариф. значение
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();

        // Заполнение списка случайными числами
        for (int i = 0; i < 10; i++) {
            numbers.add(rnd.nextInt(100));
        }
        System.out.println("Список случайных чисел: " + numbers);

        // Удаляем из списка четные числа
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println("Список чисел после удаления четных чисел: " + numbers);

        // Находим минимальное значение
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }
        }
        System.out.println("Минимальное значение в списке равно: " + min);

        // Находим максимальное значение в списке
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        System.out.println("Максимальное значение в списке равно: " + max);

        // Находим среднее арифметическое значение
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double avg = sum / numbers.size();
        System.out.println("Среднее арифметическое значение в списке равно: " + avg);

    }
}