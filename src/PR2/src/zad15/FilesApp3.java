package zad15;

import java.io.*; // Импортируем классы для работы с вводом-выводом (например, FileWriter).
import java.util.Scanner; // Импортируем класс Scanner для считывания ввода с клавиатуры.

public class FilesApp3 {
    public static void main(String[] args) {
        // Открываем файл для записи (с параметром 'false' для перезаписи файла)
        try (Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для чтения данных с клавиатуры
             FileWriter writer = new FileWriter("C:\\Users\\nadsh\\Downloads\\tam.txt", false)) { // Создаем объект FileWriter для записи в файл, false - для перезаписи
            System.out.println("Введите новый текст для замены информации в файле:"); // Печатаем запрос на новый текст
            String inputText = scanner.nextLine(); // Читаем введенный текст
            writer.write(inputText); // Записываем новый текст в файл
            writer.flush(); // Принудительно очищаем буфер записи, чтобы все данные были записаны в файл
            System.out.println("Файл успешно обновлён."); // Печатаем сообщение об успешной записи
        } catch (IOException ex) { // Если происходит ошибка при записи в файл, программа переходит в блок catch
            System.out.println(ex.getMessage()); // Печатаем сообщение об ошибке
        }
    }
}