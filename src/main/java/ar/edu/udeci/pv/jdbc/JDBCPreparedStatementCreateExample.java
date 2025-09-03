package ar.edu.udeci.pv.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ar.edu.udeci.pv.jdbc.util.ConnectionUtil;

public class JDBCPreparedStatementCreateExample {

	public static void main(String[] argv) {

		try {

			createTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void createTable() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String createTableSQL = "CREATE TABLE DBUSER1("
				+ "USER_ID NUMBER(5) NOT NULL, "
				+ "USERNAME VARCHAR(20) NOT NULL, "
				+ "CREATED_BY VARCHAR(20) NOT NULL, "
				+ "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) "
				+ ")";

		try {
			dbConnection = ConnectionUtil.getConnectionTest();
			preparedStatement = dbConnection.prepareStatement(createTableSQL);

			System.out.println(createTableSQL);

			// execute create SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Table \"dbuser\" is created!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

}