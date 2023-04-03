package Seminar_5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин",
                "Иван Ежов"};

        Map<String, Integer> nameCountMap = new HashMap<>();

        for (String employee : employees) {
            String employeeName = employee.split(" ")[0];
            nameCountMap.put(employeeName, nameCountMap.getOrDefault(employeeName, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNameCountList = new ArrayList<>(nameCountMap.entrySet());

        sortedNameCountList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedNameCountList) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " раз(а)");
            }
        }
    }
}