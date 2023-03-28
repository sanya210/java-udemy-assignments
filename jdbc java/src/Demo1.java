import java.sql.*;
public class Demo1 {

    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbc_practice";
        String uname="root";
        String pass="sanya@123";
        String query = "select * from student";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement(); // returns object
        // executeQuery is DQL
        ResultSet rs = st.executeQuery(query); // this returns the value in a table structure so we'll store it in resultSet

        String userData="";
        while(rs.next())
        {
            userData = rs.getInt(1) + " " + rs.getString(2);
            System.out.println(userData);
        }

        st.close();
        con.close();
    }
}
