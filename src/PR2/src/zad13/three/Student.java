package zad13.three;


// Класс, представляющий студента
public class Student {
    private String name; // Имя студента
    private int gpa;     // Итоговый балл (GPA)

    // Конструктор
    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Геттер для GPA
    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}