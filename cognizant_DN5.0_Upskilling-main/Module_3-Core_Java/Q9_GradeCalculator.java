import java.util.Scanner;

public class Q9_GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks should be between 0 and 100.");
            scanner.close();
            return;
        }

        String grade;

        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);
        scanner.close();
    }
}