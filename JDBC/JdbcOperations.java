import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcOperations {

    static String url = "jdbc:mysql://localhost:3306/testdb";
    static String user = "root";
    static String password = "password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement insert = con.prepareStatement(
                    "INSERT INTO students (id, name, age) VALUES (?, ?, ?)"
            );
            insert.setInt(1, 2);
            insert.setString(2, "Amit");
            insert.setInt(3, 21);
            insert.executeUpdate();

            PreparedStatement update = con.prepareStatement(
                    "UPDATE students SET age = ? WHERE id = ?"
            );
            update.setInt(1, 23);
            update.setInt(2, 2);
            update.executeUpdate();

            PreparedStatement delete = con.prepareStatement(
                    "DELETE FROM students WHERE id = ?"
            );
            delete.setInt(1, 2);
            delete.executeUpdate();

            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
