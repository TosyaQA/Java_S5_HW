package Seminar_5;

import java.util.*;

public class Task1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<String, List<String>>();

    public static void addNumber(String name, String number) {
        if (phoneBook.containsKey(name)) {
            List<String> numbers = phoneBook.get(name);
            numbers.add(number);
        } else {
            List<String> numbers = new ArrayList<String>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public static void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            System.out.print(name + ": ");
            for (String number : numbers) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");

        while (true) {
            System.out.print("Введите 1) Добавление номера 2) Вывод всего: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Введите фамилию: ");
                String name = scanner.nextLine();
                System.out.print("Введите номер: ");
                String number = scanner.nextLine();
                addNumber(name, number);
            } else if (choice == 2) {
                printAll();
            } else {
                System.out.println("Неправильный выбор!");
            }
        }
    }
}