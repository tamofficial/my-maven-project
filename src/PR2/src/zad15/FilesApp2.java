package zad15;

import java.io.*; // Импортируем классы для работы с вводом-выводом (например, FileReader).

public class FilesApp2 {
    public static void main(String[] args) {
        // Открываем файл для чтения с помощью FileReader
        try (FileReader reader = new FileReader("C:\\Users\\nadsh\\Downloads\\tam.txt")) { // Создаем объект FileReader для чтения файла
            int c; // Переменная для хранения каждого символа, прочитанного из файла
            // Читаем файл по символу, пока не достигнем конца файла
            while ((c = reader.read()) != -1) { // Если c не равен -1, значит файл еще не закончился
                System.out.print((char) c); // Преобразуем прочитанный символ в char и выводим его на экран
            }
        } catch (IOException ex) { // Если происходит ошибка при чтении файла, программа переходит в блок catch
            System.out.println(ex.getMessage()); // Печатаем сообщение об ошибке
        }
    }
}