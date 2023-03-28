package Dao;

import Entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao{
    public Student getStudent(int userid)
    {
        try {
            String query = "select userName from student where userid = "+ userid;
            Student s = new Student();
            s.setUserid(userid);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_practice","root","sanya@123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            s.setUserName(name);
            return s;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return null;

    }
}
