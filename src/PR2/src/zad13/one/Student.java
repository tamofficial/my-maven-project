package zad13.one;

public class Student implements Comparable<Student> {
    // Класс Student реализует интерфейс Comparable,
    // чтобы объекты этого класса могли быть сравнены друг с другом.

    private int iDNumber; // Поле для хранения идентификационного номера студента.
    private String name;  // Поле для хранения имени студента.

    public Student(int iDNumber, String name) {
        // Конструктор для создания объекта Student с заданными iDNumber и name.
        this.iDNumber = iDNumber; // Присваиваем переданный идентификационный номер.
        this.name = name;        // Присваиваем переданное имя.
    }

    public int getiDNumber() {
        // Метод для получения идентификационного номера студента.
        return iDNumber;
    }

    public String getName() {
        // Метод для получения имени студента.
        return name;
    }

    @Override
    public int compareTo(Student other) {
        // Метод, определяющий, как сравнивать два объекта Student.
        // Сравниваем iDNumber текущего объекта с iDNumber другого объекта.
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        // Метод для представления объекта Student в виде строки.
        // Возвращает строку с iDNumber и name студента.
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                '}';
    }
}