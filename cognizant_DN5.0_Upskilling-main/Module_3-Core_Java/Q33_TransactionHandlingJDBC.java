import java.sql.*;

public class Q33_TransactionHandlingJDBC {
    static final String URL = "jdbc:mysql://localhost:3306/bank";

    static void transfer(int fromId, int toId, double amount) {
        try (Connection conn = DriverManager.getConnection(URL, "root", "password")) {
            conn.setAutoCommit(false);
            try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance=balance-? WHERE id=?");
                 PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance=balance+? WHERE id=?")) {
                debit.setDouble(1, amount); debit.setInt(2, fromId); debit.executeUpdate();
                credit.setDouble(1, amount); credit.setInt(2, toId); credit.executeUpdate();
                conn.commit();
                System.out.println("Transfer successful.");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transfer failed, rolled back: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }

    public static void main(String[] args) { transfer(1, 2, 500.0); }
}
