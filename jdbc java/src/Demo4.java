import java.sql.DriverManager;

public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException{
        //Pqr obj =new Pqr();
        // as soon as pqr encountred here, the class is loaded and its static method called
        // while object created, instance block called
        Class.forName("Pqr");
        // if we want to just load the class and call static block
        Class.forName("com.mysql.cj.jdbc.Driver");
        // instead of
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

    }
}

class Pqr{

    static{
        System.out.println("In static block");
    }
    // instance
    {
        System.out.println("in instance");
    }
}
