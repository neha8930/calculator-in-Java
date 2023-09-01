import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Student {
    // ... (unchanged)
    private String name;
    private int rollNumber;
    private String grade;
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name +  ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

     class StudentManagementSystem {
        private List<Student> students;
        private Scanner scanner;

        public StudentManagementSystem() {
            this.students = new ArrayList<>();
            this.scanner = new Scanner(System.in);
        }

        public void addStudent() {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            int rollNumber = validateIntegerInput("Enter roll number: ");
            scanner.nextLine(); // Consume newline

            System.out.print("Enter grade: ");
            String grade = scanner.nextLine();

            Student student = new Student(name, rollNumber, grade);
            students.add(student);

            System.out.println("Student added successfully.");
        }

        public void displayAllStudents() {
            for (Student student : students) {
                System.out.println(student);
            }
        }


        public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = validateIntegerInput("");
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
        // Validate and return an integer input
        private int validateIntegerInput(String message) {
            int input = -1;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print(message);
                    input = Integer.parseInt(scanner.nextLine());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            }

            return input;
        }


        // ... (unchanged)

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.run();
    }
}