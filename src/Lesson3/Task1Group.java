package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Mikhail Latypov
 * <p>
 * Заполнить список названиями планет Солнечной системы в произвольном
 * порядке с посторениями. Вывести название каждой планеты и количество повторений в списке.
 */
public class Task1Group {
    public static void main(String[] args) {
        // Создание списка планет planets с повторениями
        ArrayList<String> planets = new ArrayList<String>(Arrays.asList("Земля", "Марс", "Венера", "Марс", "Сатурн", "Венера", "Земля", "Земля"));
        // Создание списка планет planets2
        ArrayList<String> planets2 = new ArrayList<String>(Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"));
        // Объявление и инициализация переменной counter
        int counter = 0;

        // Итерация по элементам списка planets2
        for (String element : planets2) {
            // Обнуление переменной counter перед подсчетом повторений следующей планеты
            counter = Collections.frequency(planets, element);

            // Итерация по элементам списка planets
//            for (String str : planets) {
//                // Если элементы совпадают, увеличиваем счетчик повторений
//                if (element.equals(str)) {
//                    counter++;
//                }
//            }
            // Если количество повторений больше 0, выводим результат на экран
            if (counter > 0)
                System.out.printf("%s: %d\n", element, counter);
        }
    }
}

// Код создает два списка планет и выводит на экран количество повторений каждой планеты из списка planets2 в списке planets.
