import java.sql.*;

public class JdbcDemo {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating table...");
            stmt = conn.createStatement();
            String createTableSql = "CREATE TABLE IF NOT EXISTS Employee " +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(createTableSql);
            System.out.println("Table created successfully");

            // Insertion
            System.out.println("Inserting records into the table...");
            String insertSql = "INSERT INTO Employee (id, name, age) VALUES (1, 'John Doe', 30)";
            stmt.executeUpdate(insertSql);
            System.out.println("Record inserted");

            // Selection
            System.out.println("Selecting records from the table...");
            String selectSql = "SELECT id, name, age FROM Employee";
            ResultSet rs = stmt.executeQuery(selectSql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Updating
            System.out.println("Updating records in the table...");
            String updateSql = "UPDATE Employee SET age = 35 WHERE id = 1";
            stmt.executeUpdate(updateSql);
            System.out.println("Record updated");

            // Deletion
            System.out.println("Deleting records from the table...");
            String deleteSql = "DELETE FROM Employee WHERE id = 1";
            stmt.executeUpdate(deleteSql);
            System.out.println("Record deleted");

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
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
