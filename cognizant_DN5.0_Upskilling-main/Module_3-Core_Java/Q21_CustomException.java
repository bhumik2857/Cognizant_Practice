import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}

public class Q21_CustomException {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Age " + age + " is invalid. Must be 18+.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
            System.out.println("Access granted.");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
