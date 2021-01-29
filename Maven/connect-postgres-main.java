package com.revature.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.Driver;

public class Main {
	public static void main(String[] args) {
		/*
		 * Steps to connect to postgres database in main
		 * Step 1 : 加载驱动
		 * Step 2 : 输入数据库，用户名，密码
		 * Step 3 : 连接数据库
		 * Step 4 : 创建Statement对象，用户操作数据
		 * Step 5 : 创建QUERY STATEMENT
		 * Step 6 : 执行程序
		 * Step 7 : 获取数据，并打印数据
		 * 
		 * Safety way to access sensitive data by using 
		 * String username = System.getenv("db_username");
		 * String password = System.getenv("db_password");
		 */
		
		Connection connection = null;	//create an obj to hold the collection
		try {
			//Step 1 : 加载驱动
			DriverManager.registerDriver(new Driver());
			System.out.println("驱动加载成功");
			
			//Step 2: 输入数据库，用户名，密码
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "password";
			
			//Step3 : 连接数据库
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("打印成功连接数据库");
			
			// Step 4: 创建Statement对象，用户操作数据
			Statement stmt = connection.createStatement();
			
			// Step 5: 创建QUERY STATEMENT
			String sql = "SELECT * FROM jdbc_demo_1.player";
			
			// Step 6: 执行程序
			ResultSet resultSet = stmt.executeQuery(sql);
			
			// Step 7: 获取数据，并打印数据
			while(resultSet.next()) {
				System.out.print("id:" + resultSet.getInt("id"));
				System.out.print("\tPlayer name: " + resultSet.getString("player_name"));
				System.out.print("\tPlayer position: " + resultSet.getString("player_position"));
				System.out.print("\tGender: " + resultSet.getString("gender"));
				System.out.print("\tAge: " + resultSet.getInt("age"));
				System.out.println();
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
