package zad13.four;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = {
                new Student("Дима", 85),
                new Student("Вика", 92),
                new Student("Евгений", 78),
                new Student("Никита", 85),
                new Student("Тамерлан", 95)
        };

        // Выводим список до сортировки
        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортируем массив студентов (метод Arrays.sort использует compareTo)
        Arrays.sort(students);

        // Выводим список после сортировки
        System.out.println("\nAfter sorting by GPA (descending) and name (ascending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}