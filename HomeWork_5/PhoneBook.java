package HomeWork_5;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap.
 * Программа также должна учитывать, что во входной структуре будут
 * повторяющиеся имена с разными телефонами, их необходимо считать, как одного
 * человека с разными телефонами. Вывод должен быть отсортирован по убыванию
 * числа телефонов.
 * 
 * Пример:
 * Иванов 1231234
 * Иванов 3456345
 * Иванов 5676585
 * Петров 12345
 * Петров 82332
 */

public class PhoneBook {
    private HashMap<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String number) {
        if (contacts.containsKey(name)) {
            String existingNumbers = contacts.get(name);
            existingNumbers += ", " + number;
            contacts.put(name, existingNumbers);
        } else {
            contacts.put(name, number);
        }
    }

    public void printContacts() {
        for (int i = contacts.size(); i > 0; i--) {
            for (String name : contacts.keySet()) {
                if (contacts.get(name).split(", ").length == i) {
                    System.out.println(name + ": " + contacts.get(name));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Введите имя и номер телефона контакта через пробел или 'exit' для выхода:");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            String[] contact = input.split(" ");
            if (contact.length != 2) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
                continue;
            }

            String[] parts = input.split(" ");
            String name = parts[0];
            String number = parts[1];

            phoneBook.addContact(name, number);
        }
        sc.close();
        phoneBook.printContacts();
    }
}
