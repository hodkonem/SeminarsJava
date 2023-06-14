package Lesson2;

import java.io.FileWriter;

/**
 * Записать в файл 10 раз слово TEST
 */
public class GroupTask3 {
    public static void main(String[] args) {
        int n = 10;
        String text = "TEST";
        try {
            FileWriter file = new FileWriter("test.txt", true); // второй параметр true дописывает, а false перезаписывает
            for (int i = 0; i < n; i++) {
                file.write((text));
                file.write("\n");
            }
            file.close();
            System.out.println("Получилось");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
