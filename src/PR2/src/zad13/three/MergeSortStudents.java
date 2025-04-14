package zad13.three;

import java.util.ArrayList;
import java.util.List;

// Класс для объединения и сортировки студентов
class MergeSortStudents {

    // Метод для объединения двух списков студентов
    public List<Student> mergeLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1); // Создаём объединённый список
        mergedList.addAll(list2); // Добавляем второй список
        return mergeSort(mergedList); // Сортируем объединённый список
    }

    // Метод для сортировки списка с использованием сортировки слиянием
    private List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return students; // Если список содержит 1 элемент, он уже отсортирован
        }

        // Разделяем список на две части
        int mid = students.size() / 2;
        List<Student> left = students.subList(0, mid); // Левая часть
        List<Student> right = students.subList(mid, students.size()); // Правая часть

        // Рекурсивно сортируем обе части
        return merge(mergeSort(new ArrayList<>(left)), mergeSort(new ArrayList<>(right)));
    }

    // Метод для слияния двух отсортированных списков
    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        // Сравниваем элементы двух списков и добавляем их в результат
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGpa() <= right.get(j).getGpa()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        // Добавляем оставшиеся элементы из левого списка
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        // Добавляем оставшиеся элементы из правого списка
        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}