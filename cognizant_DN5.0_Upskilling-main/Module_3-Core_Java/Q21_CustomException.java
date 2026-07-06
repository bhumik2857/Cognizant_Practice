import java.util.Scanner;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Q21_CustomException {

    // Checks whether the entered age satisfies the minimum requirement.
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                    "Age " + age + " is invalid. Minimum age required is 18.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
            System.out.println("Access granted.");
        } catch (InvalidAgeException exception) {
            System.out.println("Exception: " + exception.getMessage());
        } finally {
            scanner.close();
        }
    }
}