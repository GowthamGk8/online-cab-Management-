 package Com.Mytaxi.Ulti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUlti {

	
private static Connection con = null;
	
	public static Connection createConnection() 
			throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String databaseUrl = "jdbc:mysql://localhost:3306/taxi";
		String username = "root";
		String password = "";
		
		con = DriverManager.getConnection(databaseUrl, username, password);
		
		return con;
	}
	
	public static void stopConnection() 
			throws SQLException {
		con.close();
	}
}
