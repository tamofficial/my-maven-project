package lab1;

class zad3 {
}
class cikl {
    public static void main (String[] args) {
        // Цикл для вывода аргументов командной строки
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}