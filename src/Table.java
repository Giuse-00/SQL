import javax.xml.transform.Result;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;

public class Table {

    public static void main(String[] args) {

        ArrayList<String> arrayLastNames = new ArrayList<>();
        ArrayList<Student> italianStudents = new ArrayList<>();
        ArrayList<Student> germanStudents = new ArrayList<>();

        Statement pStmnt = null;


        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb",
                    "developer", "123456");

            Statement statement = connection.createStatement();

            //ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

           /*while (resultSet.next()) {

               String firstNames = resultSet.getString("first_name");
               String lastNames = resultSet.getString("last_name");

                /* ALTER EXERCISE

                String newColumn = "ALTER TABLE students ADD country VARCHAR(30)";
                pStmnt = connection.createStatement();
                pStmnt.executeUpdate();

                String newColumn = "UPDATE students SET country = 'Italy' WHERE students_id IN (1, 2)";
                pStmnt.executeUpdate(newColumn);

                newColumn = "UPDATE students SET country = 'Germany' WHERE students_id IN (3, 4)";
                pStmnt.executeUpdate(newColumn);



               arrayLastNames.add(lastNames);

               System.out.println(arrayLastNames);
*/

               // ----------------------------------------------------------------------------------------------------------------------

            /* VIEW EXERCISE
               String italianView = "CREATE VIEW italian_students AS SELECT last_name, first_name FROM students WHERE country = 'Italy'";
               pStmnt = connection.createStatement();
               pStmnt.executeUpdate(italianView);

               String germanView = "CREATE VIEW german_students AS SELECT last_name, first_name FROM students WHERE country = 'Germany'";
               pStmnt = connection.createStatement();
               pStmnt.executeUpdate(germanView);

                   ResultSet italianResult = statement.executeQuery("SELECT last_name, first_name FROM italian_students");

                   while (italianResult.next()) {
                       italianStudents.add(new Student(italianResult.getString("first_name"), italianResult.getString("last_name")));
                   }

                   ResultSet germanResult = statement.executeQuery("SELECT last_name, first_name FROM german_students");

                   while (germanResult.next()) {
                       germanStudents.add(new Student(germanResult.getString("first_name"), germanResult.getString("last_name")));
                   }
                   */



        } catch (SQLException e) {
            e.printStackTrace();
        }

}
}






