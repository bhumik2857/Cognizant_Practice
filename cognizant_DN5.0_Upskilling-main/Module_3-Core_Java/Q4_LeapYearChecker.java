import java.util.Scanner;

public class Q4_LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // A leap year is divisible by 4 but not by 100,
        // unless it is also divisible by 400.
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}