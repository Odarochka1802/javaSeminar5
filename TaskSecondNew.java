package org.example;

import java.util.*;

import static java.lang.System.*;

class TaskSecondNew {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        String[] a = new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        for (String x:a) {
            list.add(x);
        }
        Map<String, Integer> counter = new HashMap<>();

        for (String x : list) {
            int newValue = counter.getOrDefault(x.split(" ")[0], 0) + 1;
            counter.put(x.split(" ")[0], newValue);
        }
        out.println("Наш словарь только с именами: " + counter);

        Set<String> keys = counter.keySet();
        out.println("Повторяющиеся имена: ");
        for (String key: keys)
        {
            Integer value = counter.get(key);
            if(value>1)
                System.out.println("Имя: " +"'"+ key +"'" + " колличество повтерений: " + value);
        }

        counter.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
