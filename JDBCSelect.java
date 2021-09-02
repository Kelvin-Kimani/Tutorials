import java.sql.*;

public class JDBCSelect {
    public static void main(String[] args) {

         final String url = "jdbc:mysql://localhost:3306/tracom";
        final String username = "root";
        final String pwd = "Kelvin@5257";

        try {
            //Create Connection
            Connection conn = DriverManager.getConnection(url, username, pwd);

            //Create a statement
            Statement st = conn.createStatement();

            //Create a query
            String sql = "SELECT * FROM student";

            //Run the query
            ResultSet rs = st.executeQuery(sql);

            //List items
            while (rs.next()){

                System.out.println(rs.getInt(1)
                        + " " + rs.getString(2)
                        + " " + rs.getString(3)
                        + " " + rs.getString(4)
                        + " " + rs.getString(5));

            }

            conn.close();
        }

        catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
