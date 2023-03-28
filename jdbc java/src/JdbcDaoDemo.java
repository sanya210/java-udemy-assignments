import Dao.StudentDao;
import Entity.Student;
import Dao.DaoAdd;

public class JdbcDaoDemo {
    public static void main(String[] args) {
//  StudentDao dao = new StudentDao();
//Student s1 = dao.getStudent(5);
//System.out.println(s1.getUserName());
    Student s2 = new Student();
        DaoAdd dao1 = new DaoAdd();
   s2.setUserid(8);
        s2.setUserName("Tia");
     dao1.connect();
    dao1.addStudent(s2);
 //       dao1.practice();
    }
}
