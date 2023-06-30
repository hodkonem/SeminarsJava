package Lesson5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<NoteBook> notebooks = new ArrayList<>();
        notebooks.add(new NoteBook("8GB", "256GB", "Windows 10", "Silver"));
        notebooks.add(new NoteBook("16GB", "512GB", "MacOS", "Space Gray"));
        notebooks.add(new NoteBook("8GB", "512GB", "Ubuntu 22.04", "Black"));

        Scanner console = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        int criteria = console.nextInt();

        String value;
        switch (criteria) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                value = console.next();
                notebooks.stream()
                        .filter(notebook -> notebook.getRam().equals(value))
                        .forEach(System.out::println);
                break;
            case 2:
                System.out.println("Введите минимальное значение объема жесткого диска:");
                value = console.next();
                notebooks.stream()
                        .filter(notebook -> notebook.getHdd().equals(value))
                        .forEach(System.out::println);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                value = console.next();
                notebooks.stream()
                        .filter(notebook -> notebook.getOs().equals(value))
                        .forEach(System.out::println);
                break;
            case 4:
                System.out.println("Введите цвет:");
                value = console.next();
                notebooks.stream()
                        .filter(notebook -> notebook.getColor().equals(value))
                        .forEach(System.out::println);
                break;
            default:
                System.out.println("Вы выбрали некорректный критерий");
        }

        console.close();
    }
}