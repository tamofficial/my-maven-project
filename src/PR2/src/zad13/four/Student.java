package zad13.four;

// Класс Student, реализующий интерфейс Comparable
public class Student implements Comparable<Student> {
    private String name; // Имя студента
    private int gpa; // Итоговый балл (GPA)

    // Конструктор для инициализации студента
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

    // Реализация метода compareTo
    @Override
    public int compareTo(Student other) {
        // Сравнение по GPA (по убыванию)
        if (this.gpa != other.gpa) {
            return Integer.compare(other.gpa, this.gpa);
        }
        // Если GPA равны, сравниваем по имени (по возрастанию)
        return this.name.compareTo(other.name);
    }

    // Метод toString для удобного вывода информации
    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + '}';
    }
}