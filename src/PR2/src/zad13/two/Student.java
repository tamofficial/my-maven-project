package zad13.two;

// Класс, представляющий студента
public class Student {
    private String name; // Имя студента
    private int gpa; // Итоговый балл (GPA)

    // Конструктор для инициализации студента
    public Student(String name, int gpa) {
        this.name = name; // Присваиваем имя
        this.gpa = gpa;   // Присваиваем GPA
    }

    // Геттер для имени
    public String getName() {
        return name; // Возвращаем имя студента
    }

    // Геттер для GPA
    public int getGpa() {
        return gpa; // Возвращаем GPA студента
    }

    @Override
    public String toString() {
        // Форматируем строку для удобного вывода информации о студенте
        return "Student{name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}