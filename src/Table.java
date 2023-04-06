import java.sql.*;
import java.sql.DriverManager;

public class Table {

    public static void main(String[] args) {

        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb",
                    "developer", "123456");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}






