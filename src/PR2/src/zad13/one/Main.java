package zad13.one;


public class Main {
    public static void main(String[] args) {
        // Точка входа в программу.

        Student[] students = {
                // Создаем массив объектов Student с разными iDNumber и именами.
                new Student(102, "Тамерлан"),
                new Student(101, "Иван"),
                new Student(104, "Александр"),
                new Student(103, "Жанна")
        };

        System.out.println("Before Sorting:");
        // Выводим массив студентов до сортировки.
        for (Student student : students) {
            System.out.println(student); // Используем метод toString для каждого объекта.
        }

        Sortirovka.insertionSort(students);
        // Сортируем массив студентов методом вставок.

        System.out.println("\nAfter Sorting:");
        // Выводим массив студентов после сортировки.
        for (Student student : students) {
            System.out.println(student); // Используем метод toString для каждого объекта.
        }
    }
}