
package electricity.biling.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
     c =  DriverManager.getConnection("jdbc:mysql:///pqr", "root","codeforsup");
        s=c.createStatement();
    } catch(Exception e) {
        e.printStackTrace();
    }
}
}