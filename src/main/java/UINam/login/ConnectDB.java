package UINam.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cuahangbangiay", "root", "");
            System.out.println("Connect Successfully!");
        } catch (Exception ex) {
            System.out.println("Connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
