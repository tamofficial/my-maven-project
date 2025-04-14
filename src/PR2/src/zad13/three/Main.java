package zad13.three;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаём два списка студентов
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Саша", 85));
        list1.add(new Student("Тамерлан", 92));
        list1.add(new Student("Владимир", 78));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Давид", 88));
        list2.add(new Student("Ангелина", 95));
        list2.add(new Student("Никита", 80));

        // Выводим исходные списки студентов
        System.out.println("List 1:");
        for (Student student : list1) {
            System.out.println(student);
        }

        System.out.println("\nList 2:");
        for (Student student : list2) {
            System.out.println(student);
        }

        // Создаём объект для объединения и сортировки
        MergeSortStudents sorter = new MergeSortStudents();

        // Объединяем и сортируем списки
        List<Student> mergedList = sorter.mergeLists(list1, list2);

        // Выводим отсортированный список
        System.out.println("\nMerged and sorted list:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}