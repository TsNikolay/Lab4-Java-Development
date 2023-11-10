/**
 * Ця Java-програма демонструє просту систему управління студентами з використанням класів та масивів.
 * Вона містить клас `Main`, який містить метод `main`, що створює масив об'єктів `Student`
 * і виконує сортування за віком та ім'ям.
 */
public class Main {
    public static void main(String[] args) {
        try {
            int studentBookNumber = 1122;
            int C11 = studentBookNumber % 11;
            System.out.println("C11 = " + studentBookNumber + " mod 11 = " + C11
                    + " => Визначити клас студент, який складається як мінімум з 5-и полів");

            // Створення масиву об'єктів студентів
            Student[] students = new Student[5];
            students[0] = new Student("Іванов Іван", 22, true, 85.5, "KPI");
            students[1] = new Student("Петров Петро", 21, true, 78.0, "KNEU");
            students[2] = new Student("Сидоров Михайло", 23, false, 92.5, "KPI");
            students[3] = new Student("Коваленко Анна", 20, false, 76.5, "KNU");
            students[4] = new Student("Морозова Олена", 24, true, 88.0, "KPI");

            System.out.println("\nПочатковий масив:");
            printStudents(students);

            Student.sortByAgeAscending(students);
            System.out.println("\nСортування по віку за зростанням:");
            printStudents(students);

            Student.sortByNameDescending(students);
            System.out.println("\nСортування по імені за спаданням:");
            printStudents(students);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    // Допоміжний метод для виведення масиву об'єктів студентів
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

