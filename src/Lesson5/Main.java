package Lesson5;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<>();

        // Создание объектов и добавление в множество
        Notebook notebook1 = new Notebook(8, 500, "Windows", "Silver");
        notebooks.add(notebook1);

        Notebook notebook2 = new Notebook(16, 1000, "MacOS", "Space Gray");
        notebooks.add(notebook2);

        Notebook notebook3 = new Notebook(8, 1000, "Linux", "Black");
        notebooks.add(notebook3);

        Notebook notebook4 = new Notebook(16, 500, "Windows", "White");
        notebooks.add(notebook4);

        Notebook notebook5 = new Notebook(8, 500, "MacOS", "Silver");
        notebooks.add(notebook5);

        // Здесь ты можешь вызывать методы фильтрации и вывода подходящих ноутбуков
    }
}
