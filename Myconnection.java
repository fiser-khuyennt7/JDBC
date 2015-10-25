
package connect;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Myconnection  {
	
	public static void main(String[] args)throws ClassNotFoundException  {
		
		Connection connection = null;
		String className = ("com.mysql.jdbc.Driver");
			try{
			Class.forName(className);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","16101995");
			System.out.println("Connected!!!");
			} catch (SQLException e) {
				System.out.println("Not Connect!!!");
			}
	}
}
