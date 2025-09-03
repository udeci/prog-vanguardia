package ar.edu.udeci.pv.jdbc;

import ar.edu.udeci.pv.jdbc.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;


public class ExampleJdbc {

	public static void main(String[] argv) {
	
		System.out.println("-------- MySQL JDBC Connection Testing ------------");
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}
	
		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;
	
		connection = ConnectionUtil.getConnectionTest();


		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		try {
			connection.getMetaData().getTypeInfo();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
