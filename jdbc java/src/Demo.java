import java.sql.*;
public class Demo {

    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbc_practice";
        String uname="root";
        String pass="sanya@123";
        String query = "select username from student where userid=3";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement(); // returns object
        ResultSet rs = st.executeQuery(query); // this returns the value in a table structure so we'll store it in resultSet

        rs.next();
        String name = rs.getString("username");

        System.out.println(name);

        st.close();
        con.close();
    }
}
