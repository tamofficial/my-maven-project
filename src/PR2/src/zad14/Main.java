package zad14;


public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();

        // Добавление элементов
        myList.add("Германия");
        myList.add("Франция");
        myList.add("Италия");

        // Получение элемента
        System.out.println("Элемент на индексе 1: " + myList.get(1));

        // Удаление элемента
        myList.remove(1);

        // Замена элемента
        myList.set(1, "Испания");

        // Вывод всех элементов
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}