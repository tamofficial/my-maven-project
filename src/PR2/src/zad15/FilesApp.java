package zad15;

import java.io.*; // Импортируем все классы из пакета java.io, которые обеспечивают работу с вводом-выводом (например, FileWriter).
import java.util.Scanner; // Импортируем класс Scanner для считывания ввода с клавиатуры.

public class FilesApp {
    public static void main(String[] args) {
        // Создаем два ресурса: scanner для считывания данных с клавиатуры и writer для записи в файл
        try (Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для чтения ввода с клавиатуры
             FileWriter writer = new FileWriter("C:\\Users\\nadsh\\Downloads\\tam.txt")) { // Создаем объект FileWriter для записи в файл
            System.out.println("Введите текст для записи в файл:"); // Печатаем запрос на ввод текста
            String inputText = scanner.nextLine(); // Читаем введенную строку и сохраняем в переменную inputText
            writer.write(inputText); // Записываем введенную строку в файл
            writer.flush(); // Принудительно очищаем буфер записи, чтобы убедиться, что данные записаны в файл
            System.out.println("Текст успешно записан в файл."); // Печатаем сообщение об успешной записи
        } catch (IOException ex) { // Если происходит ошибка при записи в файл, программа переходит в блок catch
            System.out.println(ex.getMessage()); // Печатаем сообщение об ошибке
        }
    }
}