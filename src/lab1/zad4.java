package lab1;

public class zad4 {
}

class HarmonicSeries {
    public static void main(String[] args) {
        int n = 10; // Количество членов гармонического ряда, которые нужно вывести
        System.out.printf("Первые %d чисел гармонического ряда:\n", n);

        for (int i = 1; i <= n; i++) {
            double harmonicNumber = 0;
            for (int j = 1; j <= i; j++) {
                harmonicNumber += 1.0 / j;
            }
            System.out.printf("H(%d) = %.4f\n", i, harmonicNumber);
        }
    }
}