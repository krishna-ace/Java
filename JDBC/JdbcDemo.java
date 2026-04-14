import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo {

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected");

            String insertQuery = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertQuery);

            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setInt(3, 22);

            ps.executeUpdate();
            System.out.println("Inserted");

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
            System.out.println(e.getMessage());
        }
    }
}
