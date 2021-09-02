import java.sql.*;

public class JDBCDelete {
    public static void main(String[] args) {
        final String url = "jdbc:mysql://localhost:3306/tracom";
        final String username = "root";
        final String pwd = "Kelvin@5257";
        final String students = "SELECT * FROM student";

        try{

            //Load Driver but we no longer do that in 8+

            //Create a connection
            Connection conn = DriverManager.getConnection(url, username, pwd);

            //Create a statement
            Statement st = conn.createStatement();

            //Write query
            String deleteSQL= "DELETE FROM student " +
                    "WHERE regno = 15";

            //Load statement
            PreparedStatement ps = conn.prepareStatement(deleteSQL);

            //Check if deleted
            int rowsAffected = ps.executeUpdate();
            System.out.println(rowsAffected + " rows affected");

            //Return remaining rows
            ResultSet rs = st.executeQuery(students);

            //List items
            while (rs.next()){

                System.out.println(rs.getInt(1) + " "
                        + rs.getString(2) + " "
                        + rs.getString(3) + " "
                        + rs.getString(4) + " "
                        + rs.getString(5));

            }

            conn.close();

        }
        catch (SQLException se){

            se.printStackTrace();

        }

    }
}
