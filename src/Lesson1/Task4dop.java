package Lesson1;

import java.util.Scanner;

public class Task4dop {
    /* Дополнительно. Задано уравнение вида x + y = z. Где, (x, y, z) >= 0.
    Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69
    Требуется восстановить выражение до верного равенства.
    Предложить хотя бы одно решение или сообщить, что его нет
    Вывод: 24 + 45 = 69
     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите уравнение вида '2? + ?5 = 69'");
        String equation = console.nextLine();
        String message = "Решения нет!";
        for (int i = 0; i < equation.length(); i++) {
            String result = equation.replace("?", Integer.toString(i)); // Заменяем каждый символ вопроса в строке equation на значение i. Результат сохраняется в переменную result.
            String[] array = result.split(" "); // Разбиваем строку result на массив строк, используя пробел как разделитель. Результат сохраняется в массив array.
            if (Integer.parseInt(array[0]) + Integer.parseInt(array[2]) == Integer.parseInt(array[4])) // проверяете, равно ли сумма первого и третьего элементов массива array четвертому элементу.
                message = result; // Если да, то вы сохраняете результат в переменную message.
        }
        System.out.println(message);
        console.close();
    }
}
