package Lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        // Исходный массив
        int[] arr = {5, 2, 8, 1, 9};
        int n = arr.length;
        boolean swapped = false;
        try {
            // Создаем объект для записи в файл
            FileWriter writer = new FileWriter("log.txt");
            // Записываем исходный массив в файл
            writer.write("Initial Array: ");
            for (int i = 0; i < n; i++) {
                writer.write(arr[i] + " ");
            }
            writer.write("\n");
            // Реализуем алгоритм сортировки пузырьком
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    // Если текущий элемент больше следующего, меняем их местами
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
                // Если на этой итерации не было перестановок, массив уже отсортирован
                if (!swapped) {
                    break;
                }
                // Записываем текущее состояние массива в файл
                writer.write("After iteration " + (i + 1) + ": ");
                for (int k = 0; k < n; k++) {
                    writer.write(arr[k] + " ");
                }
                writer.write("\n");
            }
            // Закрываем объект для записи в файл
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
