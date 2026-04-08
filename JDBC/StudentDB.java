import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDB{
    public static void main(String[] args) {
      
        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String host = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "";
        String create_table = """
                CREATE TABLE IF NOT EXISTS student (
                id INT PRIMARY KEY AUTO_INCREMENT,
                name VARCHAR(50) NOT NULL,
                course DECIMAL(10,2)
                ) 
                """;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(host,username,password);
            Statement smt = con.createStatement();
            int rowAffected = smt.executeUpdate("""
                insert into student (name,course,marks) values
                ('Student2','B.pharma','70')
            """);


            // smt.executeUpdate( create_table);
            // System.out.println("Table ready");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}