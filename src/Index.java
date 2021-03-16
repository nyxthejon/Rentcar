import javax.sql.rowset.spi.XmlReader;
import javax.swing.*;
import java.sql.*;

class Index{

    public static void main(String args[]){
        new testform();

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT Lname FROM Customers WHERE Snum = 2001");


    }
}
