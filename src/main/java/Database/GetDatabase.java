package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetDatabase {
	public static Connection getConnection() {
		Connection connection =null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String URL="jdbc:sqlserver://localhost:1433;databaseName=CuaHangBanGiay;intergratedSecurity=true;encrypt=true;trustServerCertificate=true; ";
			String user="laitanloc12a3@gmail.com";
			String pass="Phuc. 20032003";
			connection=DriverManager.getConnection(URL, user, pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	public static void CloseConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
