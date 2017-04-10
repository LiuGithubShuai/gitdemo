package com.kaishengit.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	
	/*private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql:///lib22";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";*/
	
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql:///lib22";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getConnection(){
				
		Connection connection = null;
		
		try {
			Class.forName(DRIVER);		
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return connection;
	}

}
