import java.sql.*;


public class JDBCInsert {
    public static void main(String[] args) {

        final String url = "jdbc:mysql://localhost:3306/tracom";
        final String username = "root";
        final String pwd = "Kelvin@5257";
        final String getStudents = "SELECT * FROM student";

        try {
            //Load driver but we no longer do that in 8+

            //Create connection
            Connection conn = DriverManager.getConnection(url, username, pwd);

            /*Create a statement but a little different with insert
            * Start with the statement declaration
            * Use PreparedStatement to execute the query
            *  */

            String insertstudent = "INSERT INTO student (regno, name, email, phone, gender) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(insertstudent);
            //Now start inserting with ps
            ps.setInt(1,  13);
            ps.setString(2, "Kelvin");
            ps.setString(3, "kv@tracom.co.ke");
            ps.setString(4, "+25470838747");
            ps.setString(5, "MALE");

            //Return rows affected
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0){
                System.out.println("A new user added!\n" + rowsAffected + " rows affected.");
            }

            //get the whole table
            ResultSet rs = ps.executeQuery(getStudents);
            while (rs.next()){
                System.out.println(rs.getInt(1) + " "
                        + rs.getString(2) + " "
                        + rs.getString(3) + " "
                        + rs.getString(4) + " "
                        + rs.getString(5));
            }

            conn.close();

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
