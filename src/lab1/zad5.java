package lab1;


class FactorialCalculator {

    // Метод для вычисления факториала числа
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Проверка работы метода
        int[] testNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Массив чисел

        System.out.println("Факториалы чисел от 0 до 10:");
        for (int number : testNumbers) {
            System.out.printf("%d! = %d\n", number, factorial(number));
        }
    }
}