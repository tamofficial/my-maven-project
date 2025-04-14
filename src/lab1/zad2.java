package lab1;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите количество элементов в массиве: ");
        int size = scanner.nextInt();

        // Создание массива
        int[] numbers = new int[size];

        // Ввод элементов массива с клавиатуры
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Переменные для суммы, максимума и минимума
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];
        int i = 0;

        // Цикл do-while для подсчета суммы элементов массива
        do {
            sum += numbers[i];
            i++;
        } while (i < size);

        // Цикл while для нахождения максимального и минимального элементов
        i = 0; // сброс счетчика
        while (i < size) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }

        // Вывод результатов
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}