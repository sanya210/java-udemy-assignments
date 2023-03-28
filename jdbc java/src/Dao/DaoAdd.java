package Dao;

import Entity.Student;

import java.sql.*;

public class DaoAdd {
    Connection con = null;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice", "root", "sanya@123");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public void addStudent(Student s)
    {
        String query = "insert into student values (?,?)";
        PreparedStatement pst;
        try{
            pst = con.prepareStatement(query);
            pst.setInt(1, s.getUserid());
            pst.setString(2,s.getUserName());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void practice()
    {
        String query = "select * from student";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 2nd column: "+ rsmd.getColumnName(2));
            System.out.println("Column Type Name of 2nd column: "+ rsmd.getColumnType(2));
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            DatabaseMetaData dbmd=con.getMetaData();
            System.out.println("Driver Name: "+dbmd.getDriverName());
            System.out.println("Driver Version: "+dbmd.getDriverVersion());
            System.out.println("UserName: "+dbmd.getUserName());
            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
