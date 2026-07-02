package bankingsystem;

public class Main {

    public static void main(String[] args) {

        // Create a Savings Account
        SavingsAccount savings = new SavingsAccount(
                101,
                "Bhumika Gupta",
                10000.0,
                5.5
        );

        // Create a Current Account
        CurrentAccount current = new CurrentAccount(
                201,
                "Amit Sharma",
                15000.0,
                5000.0
        );

        // Deposit money
        savings.deposit(2000);
        current.deposit(3000);

        // Display account details
        savings.displayAccountInfo();
        current.displayAccountInfo();
    }
}