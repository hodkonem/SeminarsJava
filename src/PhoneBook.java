/*
Задание

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
Пример ввода:
Иванов 234234
Иванов 32523
Иванов 5687
Иванов: 234234, 32523, 5687

Варианты Map:
Map<String, ArrayList>
Map<String, String>

Пример меню:
1. Добавить контакт
2. Вывести всех
3. Выход
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Mikhail
 */

public class PhoneBook {
    private Map<String, ArrayList<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            ArrayList<String> phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            ArrayList<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        }
    }

    public void printAllContacts() {
        ArrayList<Map.Entry<String, ArrayList<String>>> sortedContacts = new ArrayList<>(contacts.entrySet());
// Сортируем контакты по убыванию числа телефонов
        Collections.sort(sortedContacts, (entry1, entry2) ->
                Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, ArrayList<String>> entry : sortedContacts) {
            String name = entry.getKey();
            ArrayList<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner console = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Меню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Вывести всех");
            System.out.println("3. Выход");
            System.out.print("Выберите пункт меню: ");
            choice = console.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = console.next();
                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = console.next();
                    phoneBook.addContact(name, phoneNumber);
                    break;
                case 2:
                    phoneBook.printAllContacts();
                    break;
                case 3:
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        } while (choice != 3);
    }
}