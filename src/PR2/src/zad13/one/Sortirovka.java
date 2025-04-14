package zad13.one;

public class Sortirovka {
    public static void insertionSort(Comparable[] list) {
        // Метод сортировки вставками, принимает массив объектов,
        // реализующих интерфейс Comparable.

        for (int i = 1; i < list.length; i++) {
            // Проходим по всем элементам массива, начиная со второго.
            Comparable key = list[i]; // Сохраняем текущий элемент.
            int j = i - 1;            // Индекс для сравнения с предыдущими элементами.

            while (j >= 0 && list[j].compareTo(key) > 0) {
                // Пока не достигли начала массива и текущий элемент больше key:
                list[j + 1] = list[j]; // Сдвигаем элемент вправо.
                j--;                   // Переходим к следующему элементу слева.
            }
            list[j + 1] = key; // Вставляем key на найденное место.
        }
    }
}