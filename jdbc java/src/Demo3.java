import java.sql.*;
public class Demo3 {

    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/jdbc_practice";
        String uname="root";
        String pass="sanya@123";
        int userid = 6;
        String username = "Dia";
        String query = "insert into student values (?,?)";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        // preparedStatement because we don't know the values
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,userid); // for 1st ?
        st.setString(2,username); // for 2nd ?
        // executeUpdate is DML
        int count = st.executeUpdate();
        System.out.println(count + " row/s affected");

        st.close();
        con.close();
    }
}
