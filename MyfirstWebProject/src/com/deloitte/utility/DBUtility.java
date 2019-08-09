package com.deloitte.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {
	
	public static Connection getMyConnection() 
	{
		Connection connection= null;
		FileReader reader = null;
		Properties properties = new Properties();
		
	
		 try {
			reader = new FileReader("C:\\Users\\GAL8005\\Desktop\\sai_prasanth\\user.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			properties.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 String driver = properties.getProperty("driver");
		 String url= properties.getProperty("url");
		 String username=properties.getProperty("username");
		 String password=properties.getProperty("password");
		 
		 try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			connection= DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected");
		return connection;
		
	}

}
