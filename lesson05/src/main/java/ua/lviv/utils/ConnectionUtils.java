package ua.lviv.utils;


	import java.sql.Connection; 
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class ConnectionUtils {

		private static String USER_NAME = "root";
		private static String USER_PASSWORD = "zayka";
		private  static String URL = "jdbc:mysql://localhost:3306/i_shop";	
//		private  static String URL = "jdbc:mysql://localhost:3306/employee?useSSL=false&useUnicode=true&characterEncoding=UTF-8";	

		
		public static Connection openConnection() throws InstantiationException, IllegalAccessException,  SQLException, ClassNotFoundException {
			//Class.forName ("com.mysql.cj.jdbc.Driver").newInstance ();
		Class.forName ("com.mysql.jdbc.Driver").newInstance ();
			return DriverManager.getConnection (URL, USER_NAME, USER_PASSWORD);
		}	
	}


