package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.Driver; //Driver class is from dependency

public class ConnectionUtil {
	//Making private for not allow to create obj 
	private ConnectionUtil() {
		super();
	}
	
	//Create a funciton to used each time we need to connect to DB
	public static Connection getConnection() throws SQLException, IOException {
		// Step 1 : Loading Driver
		DriverManager.registerDriver(new Driver());
		
		// Step 2 : Read url, username, password From File
		FileInputStream fis = new FileInputStream("src/main/resources/connection.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = (String) p.get("url");
		String username = (String) p.get("username");
		String password = (String) p.get("password");
		
		// Step 3 : Make connection and return
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("\n连接数据库成功");
		return connection;
	}
}
