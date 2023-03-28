import java.sql.*;
public class Demo2 {

    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbc_practice";
        String uname="root";
        String pass="sanya@123";
        String query = "insert into student values (5, 'Tina')";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement(); // returns object
        // executeUpdate is DML
        int count = st.executeUpdate(query);
        System.out.println(count + " row/s affected");

        st.close();
        con.close();
    }
}
