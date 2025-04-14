package zad14;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Создание коллекции ArrayList
        ArrayList<String> states = new ArrayList<>();

        // Добавление элементов в список
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // Добавляем элемент на второй индекс

        // Получение элемента по индексу
        System.out.println("Элемент на втором месте: " + states.get(1));

        // Замена элемента на втором месте
        states.set(1, "Дания");

        // Вывод количества элементов в списке
        System.out.printf("В списке %d элементов\n", states.size());

        // Вывод всех элементов списка
        System.out.println("Список элементов:");
        for (String state : states) {
            System.out.println(state);
        }

        // Проверка наличия элемента в списке
        if (states.contains("Германия")) {
            System.out.println("Список содержит Германию.");
        }

        // Удаление элементов
        states.remove("Германия");
        states.remove(0); // Удаляем первый элемент

        // Преобразование списка в массив
        Object[] countries = states.toArray();
        System.out.println("Список после преобразования в массив:");
        for (Object country : countries) {
            System.out.println(country);
        }
    }
}