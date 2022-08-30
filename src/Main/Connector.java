package Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connector {
    public static void main(String[] args) {
        ConnectDb();
    }
    public static Connection ConnectDb() {
        Connection connection = null  ;
        try {
            String user="S A Mazid";
            String pass="Shahabdul2002.";
            String url ="jdbc:mysql://localhost:3306/hospitaldatacollection";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
           //JOptionPane.showMessageDialog(null, "Connection Established");
           return connection;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       return connection;
    }
}
