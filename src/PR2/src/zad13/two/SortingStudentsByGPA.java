package zad13.two;

import java.util.Comparator;

// Класс для сортировки студентов по их итоговым баллам (GPA)
class SortingStudentsByGPA implements Comparator<Student> {

    // Реализация метода compare для сортировки в порядке убывания
    @Override
    public int compare(Student s1, Student s2) {
        // Сравниваем GPA двух студентов (по убыванию)
        return Integer.compare(s2.getGpa(), s1.getGpa());
    }

    // Метод быстрой сортировки
    public void quickSort(Student[] students, int low, int high) {
        if (low < high) { // Проверяем, есть ли элементы для сортировки
            // Находим индекс опорного элемента
            int pivotIndex = partition(students, low, high);

            // Рекурсивно сортируем левую часть массива
            quickSort(students, low, pivotIndex - 1);

            // Рекурсивно сортируем правую часть массива
            quickSort(students, pivotIndex + 1, high);
        }
    }

    // Метод для разделения массива на две части (partition)
    private int partition(Student[] students, int low, int high) {
        Student pivot = students[high]; // Опорный элемент — последний элемент массива
        int i = low - 1; // Индекс для элементов, меньших опорного

        for (int j = low; j < high; j++) { // Проходим по всем элементам, кроме опорного
            // Если текущий элемент больше или равен опорному (для убывания)
            if (compare(students[j], pivot) <= 0) {
                i++; // Увеличиваем индекс для замены

                // Меняем местами текущий элемент и элемент на позиции i
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // Меняем местами опорный элемент с элементом, следующим за i
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        // Возвращаем индекс опорного элемента
        return i + 1;
    }
}