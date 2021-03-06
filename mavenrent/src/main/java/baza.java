import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class baza {

    private static Connection connect() {
        Connection con = null;
        try
        {
            con = DriverManager.getConnection("jdbc:postgresql://ec2-52-19-170-215.eu-west-1.compute.amazonaws.com:5432/dal6j2j2bi233e", "ooenbkgvbwqtco", "b26c71535815417b340efb10b2d2a4914b6bdb03a2dc611b9381e76b794bf457");
        }
        catch (SQLException e)
        {
            System.out.println("povezava z bazo ni uspela");
        }
        return con;
    }

    // Izpiše vse kraje
    public static ArrayList<String> SelectKraji()
    {
        String com = "SELECT ime_k,posta FROM kraji";
        ArrayList<String> kraji = new ArrayList<String>();

        try (Connection con = connect();
             Statement stat = con.createStatement();
             ResultSet rez = stat.executeQuery(com))
        {

            while (rez.next()) {
                String k = rez.getString(1);
                k += "|";
                k += rez.getString(2);
                kraji.add(k);
            }

        }
        catch (SQLException e) {

            System.out.println("SelectKraji() napaka " + e );
        }
        return kraji;

    }

}