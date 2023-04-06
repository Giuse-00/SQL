import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;

public class Table {

    public static void main(String[] args) {

        ArrayList<String> arrayLastNames = new ArrayList<>();

        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb",
                    "developer", "123456");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

           while (resultSet.next()){
                String firstNames = resultSet.getString("first_name");
                String lastNames = resultSet.getString("last_name");

               arrayLastNames.add(lastNames);

               System.out.println(arrayLastNames);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}






