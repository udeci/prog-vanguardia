package ar.edu.udeci.pv.jdbc.util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ConnectionUtil {

	public static final String DEFAULT_DATASOURCE_NAME = "DEFAULT_DATASOURCE_NAME_KEY";
	private static final String RMDB_DS_NAME = "RMDB_DS";
	private static final String MYSQL_NAME = "MYSQL";
	private static final String defaultConnection = "jdbc/CONSULTA_MYSQL";
	
	protected Map<String,DataSource> dataSourceMap = new HashMap<String,DataSource>();
	
	protected Map<String,DataSource> getDataSourceMap(){
		return this.dataSourceMap;
	}
	
	public String getRmdb()throws NamingException{
		
		Context		initContext = new InitialContext();
		Context		envContext  = (Context)initContext.lookup("java:/comp/env");
		HashMap 	rmdbMap  = (HashMap)envContext.lookup(RMDB_DS_NAME);

		return (String)rmdbMap.get("type");
	}
	
	public Connection getConnection() throws NamingException, SQLException, Exception{
		Connection connection = null;
		try{
			connection = this.getConnection(defaultConnection);
		}catch(Exception ex){
			return this.getConnectionTest(); 
		}
			return connection;
	}
	
	public Connection getConnection(String dataSourceName) throws NamingException, SQLException, Exception{
		
		Connection connection = null;
		
		if(this.getDataSourceMap().containsKey(dataSourceName) ){
						
			connection = this.getDataSourceMap().get(dataSourceName).getConnection();
			
		}else if(dataSourceName != null){
			
			Context    initContext = new InitialContext();
			Context    envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource dataSource  = (DataSource)envContext.lookup(dataSourceName);
			
			this.getDataSourceMap().put(dataSourceName, dataSource);
			
			connection = dataSource.getConnection();
			
		}else{
			
			// lanzamos exepcion para avisar que esta en null
			throw new Exception("El nombre del datasource no puede ser null");
		}
		
		return connection;
	}
	
	public static void close(Connection connection){
		if(connection != null){
			try{
				connection.setAutoCommit(true);
				connection.close();
			}catch(Exception e){}
		}
	}
	public static void close(ResultSet resultSet){
		if(resultSet != null){
			try{
				resultSet.close();
			}catch(Exception e){}
		}
	}
	public static void close(Statement statement){
		if(statement != null){
			try{
				statement.close();
			}catch(Exception e){}
		}
	}
	public static void close(PreparedStatement statement){
		if(statement != null){
			try{
				statement.close();
			}catch(Exception e){}
		}
	}
	
	public static Connection getConnectionTest(){
		
		Connection connection = null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver"); 
	   	    String url = "jdbc:mysql://localhost:3306/master";
	   	    connection = DriverManager.getConnection(url,"root","123456");
		}catch ( Exception ex ){
			System.out.print("Salio por time OUT, excepcion: "+ex);
        }
		return connection;
	}
}
