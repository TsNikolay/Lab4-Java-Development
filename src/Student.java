import java.util.Arrays;
import java.util.Comparator;

/**
 * Клас `Student` представляє студента з різними атрибутами, такими як повне ім'я, вік, статус навчання,
 * середній бал та університет.
 */
public class Student {
    private String fullName;
    private int age;
    private boolean doesPayForStudy;
    private double averageGrade;
    private String university;

    public Student(String fullName, int age, boolean doesPayForStudy, double averageGrade, String university) {
        this.fullName = fullName;
        this.age = age;
        this.doesPayForStudy = doesPayForStudy;
        this.averageGrade = averageGrade;
        this.university = university;
    }

    /**
     * Сортування масиву студентів за віком за зростанням.
     *
     * @param students Масив студентів, який потрібно відсортувати.
     */
    public static void sortByAgeAscending(Student[] students) {
        try {
            Arrays.sort(students, Comparator.comparingInt(Student::getAge));
        } catch (Exception e) {
            System.err.println("Неможливо відсортувати за цим полем");
            e.printStackTrace();
        }
    }

    /**
     * Сортування масиву студентів за ім'ям за спаданням.
     *
     * @param students Масив студентів, який потрібно відсортувати.
     */
    public static void sortByNameDescending(Student[] students) {
        try {
            Arrays.sort(students, (student1, student2) -> student2.getFullName().compareTo(student1.getFullName()));
        } catch (Exception e) {
            System.err.println("Неможливо відсортувати за цим полем");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Студент{" +
                "ПІБ = '" + fullName + '\'' +
                ", Вік = " + age +
                ", Чи контрактник = '" + doesPayForStudy + '\'' +
                ", Середній бал = " + averageGrade +
                ", Університет = '" + university + '\'' +
                '}';
    }

    // Геттери та сеттери для атрибутів класу
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean getDoesPayForStudy() {
        return doesPayForStudy;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getUniversity() {
        return university;
    }
}
