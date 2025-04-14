package lab1;

class praktika {
    public static void main (String[] args) {
        // Инициализация массива
        int[] numbers = {1, 2, 3, 4, 5};

        // Переменная для хранения суммы элементов
        int sum = 0;

        // Цикл for для подсчета суммы элементов массива
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Вычисление среднего арифметического
        double average = (double) sum / numbers.length;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}