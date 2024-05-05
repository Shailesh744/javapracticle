import java.sql.*;
import java.util.Scanner;

public class JdbcDynamicDemo {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating table...");
            Statement stmt = conn.createStatement();
            String createTableSql = "CREATE TABLE IF NOT EXISTS Employee " +
                    "(id INTEGER not NULL AUTO_INCREMENT, " +
                    " name VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(createTableSql);
            System.out.println("Table created successfully");

            // Dynamic Insertion
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter age:");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            String insertSql = "INSERT INTO Employee (name, age) VALUES (?, ?)";
            pstmt = conn.prepareStatement(insertSql);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.executeUpdate();
            System.out.println("Record inserted");

            // Dynamic Selection
            System.out.println("Selecting records from the table...");
            String selectSql = "SELECT id, name, age FROM Employee";
            ResultSet rs = stmt.executeQuery(selectSql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String empName = rs.getString("name");
                int empAge = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + empName + ", Age: " + empAge);
            }

            // Dynamic Updating
            System.out.println("Enter ID to update:");
            int idToUpdate = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            System.out.println("Enter new age:");
            int newAge = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            String updateSql = "UPDATE Employee SET age = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateSql);
            pstmt.setInt(1, newAge);
            pstmt.setInt(2, idToUpdate);
            pstmt.executeUpdate();
            System.out.println("Record updated");

            // Dynamic Deletion
            System.out.println("Enter ID to delete:");
            int idToDelete = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            String deleteSql = "DELETE FROM Employee WHERE id = ?";
            pstmt = conn.prepareStatement(deleteSql);
            pstmt.setInt(1, idToDelete);
            pstmt.executeUpdate();
            System.out.println("Record deleted");

            rs.close();
            pstmt.close();
            conn.close();
            scanner.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
