import java.sql.*;

public class Week12a {

    public static void main(String[] args) throws SQLException {
        // JDBC connection details
        String url = "jdbc:mysql://localhost:3306/student_database";
        String username = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS student (name VARCHAR(255), register_number VARCHAR(255), mark1 INT, mark2 INT, mark3 INT)");

            PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO student (name, register_number, mark1, mark2, mark3) VALUES (?, ?, ?, ?, ?)");
            insertStatement.setString(1, "Alice");
            insertStatement.setString(2, "12345678");
            insertStatement.setInt(3, 90);
            insertStatement.setInt(4, 85);
            insertStatement.setInt(5, 95);
            insertStatement.executeUpdate();

            insertStatement.setString(1, "Bob");
            insertStatement.setString(2, "87654321");
            insertStatement.setInt(3, 80);
            insertStatement.setInt(4, 75);
            insertStatement.setInt(5, 85);
            insertStatement.executeUpdate();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String registerNumber = resultSet.getString("register_number");
                int mark1 = resultSet.getInt("mark1");
                int mark2 = resultSet.getInt("mark2");
                int mark3 = resultSet.getInt("mark3");
                System.out.println("Name: " + name);
                System.out.println("Register Number: " + registerNumber);
                System.out.println("Mark 1: " + mark1);
                System.out.println("Mark 2: " + mark2);
                System.out.println("Mark 3: " + mark3);
                System.out.println("---------------------");
            }
        }
    }
}

