package zad15;


import java.io.*; // Импортируем классы для работы с вводом-выводом (например, FileWriter).
import java.util.Scanner; // Импортируем класс Scanner для считывания ввода с клавиатуры.

public class FilesApp4 {
    public static void main(String[] args) {
        // Открываем файл для записи в режиме дозаписи (с параметром 'true' для добавления в конец файла)
        try (Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для чтения данных с клавиатуры
             FileWriter writer = new FileWriter("C:\\Users\\nadsh\\Downloads\\tam.txt", true)) { // Создаем объект FileWriter для записи в файл, true - для добавления в конец
            System.out.println("Введите текст для добавления в конец файла:"); // Печатаем запрос на ввод текста для добавления
            String inputText = scanner.nextLine(); // Читаем введенную строку и сохраняем ее в переменной inputText
            writer.write("\n" + inputText); // Добавляем новый текст в конец файла, перед ним добавляем символ новой строки
            writer.flush(); // Принудительно очищаем буфер записи, чтобы все данные были записаны в файл
            System.out.println("Текст успешно добавлен в конец файла."); // Печатаем сообщение об успешной записи
        } catch (IOException ex) { // Если происходит ошибка при записи в файл, программа переходит в блок catch
            System.out.println(ex.getMessage()); // Печатаем сообщение об ошибке
        }
    }
}