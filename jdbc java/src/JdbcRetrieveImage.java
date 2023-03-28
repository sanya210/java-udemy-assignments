import java.sql.*;
import java.io.*;
public class JdbcRetrieveImage {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_practice", "root", "sanya@123");

            PreparedStatement ps=con.prepareStatement("select * from images");
            ResultSet rs=ps.executeQuery();
            if(rs.next()){//now on 1st row

                Blob b=rs.getBlob(2);//2 means 2nd column data
                byte barr[]=b.getBytes(1,(int)b.length());//1 means first image

                FileOutputStream fout=new FileOutputStream("/home/sanya/Downloads/imageRetr.jpg");
                fout.write(barr);

                fout.close();
            }//end of if
            System.out.println("ok");

            con.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}