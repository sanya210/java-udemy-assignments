import java.sql.*;
import java.io.*;
public class JdbcImage {
    public static void main(String[] args) {
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice", "root", "sanya@123");
            String query = "insert into images(pic) values(?)";

            PreparedStatement psm = con.prepareStatement(query);

            FileInputStream fis = new FileInputStream("/home/sanya/Downloads/image1.png");
            psm.setBinaryStream(1,fis,fis.available());
            psm.executeUpdate();
            System.out.println("done ... ");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
