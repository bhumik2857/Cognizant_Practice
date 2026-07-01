import java.sql.*;

public class Q31_BasicJDBCConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        try (Connection conn = DriverManager.getConnection(url, "root", "password");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM students")) {
            System.out.println("Connected to database.");
            while (rs.next())
                System.out.println(rs.getInt("id") + " | " + rs.getString("name"));
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }
    }
}
