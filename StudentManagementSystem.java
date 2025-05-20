import java.util.Scanner;
class Student {
    String name;
    String rollNumber; // Changed to String for more flexibility
    int age;

    public Student(String name, String rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%-12s %-20s %-5d", rollNumber, name, age);
    }
}

public class Main { // Change the class name to Main
    private static Student[] students = new Student[100];
    private static int studentCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    updateStudent(scanner);
                    break;
                case 3:
                    deleteStudent(scanner);
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine().trim();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        students[studentCount++] = new Student(name, rollNumber, age);
        System.out.println("Student added successfully!");
    }

    private static void updateStudent(Scanner scanner) {
        System.out.print("Enter Roll Number of the student to update: ");
        String rollNumber = scanner.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (students[i].rollNumber.equalsIgnoreCase(rollNumber)) {
                found = true;
                System.out.print("Enter new Name: ");
                String name = scanner.nextLine().trim();
                System.out.print("Enter new Age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                students[i] = new Student(name, rollNumber, age);
                System.out.println("Student updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Enter Roll Number of the student to delete: ");
        String rollNumber = scanner.nextLine().trim();
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (students[i].rollNumber.equalsIgnoreCase(rollNumber)) {
                found = true;
                // Shift students to the left
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null; // Clear the last element
                System.out.println("Student deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    private static void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println(String.format("%-12s %-20s %-5s", "Roll Number", "Name", "Age"));
        System.out.println("------------------------------------------------");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }
}

