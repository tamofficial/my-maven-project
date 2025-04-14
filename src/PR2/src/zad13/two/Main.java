package zad13.two;

public class Main {
    public static void main(String[] args) {
        // Создаём массив студентов
        Student[] students = {
                new Student("Саша", 85),
                new Student("Тамерлан", 92),
                new Student("Владимир", 78),
                new Student("Давид", 88),
                new Student("Ангелина", 95)
        };

        // Выводим исходный массив студентов
        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student); // Печатаем информацию о каждом студенте
        }

        // Создаём объект для сортировки
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // Сортируем массив студентов с использованием быстрой сортировки
        sorter.quickSort(students, 0, students.length - 1);

        // Выводим отсортированный массив студентов
        System.out.println("\nAfter sorting by GPA in descending order:");
        for (Student student : students) {
            System.out.println(student); // Печатаем информацию о каждом студенте после сортировки
        }
    }
}