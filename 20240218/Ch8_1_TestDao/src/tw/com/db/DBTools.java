package tw.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTools {
	private static String url ;
	private static String user ;
	private static String password ;
	private static String sqlType;
	public static final String SQL_TYPE_MYSQL= "mysql"; 
	public static final String SQL_TYPE_MSSQL= "mssql"; 
	private DBTools() {
		
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DBTools.getUrl(),
				DBTools.getUser(),
				DBTools.getPassword());
	}
	
	public static String getUrl() {
		return url;
	}
	 static void setUrl(String url) {
		DBTools.url = url;
	}
	public static String getUser() {
		return user;
	}
	 static void setUser(String user) {
		DBTools.user = user;
	}
	public static String getPassword() {
		return password;
		}
	
	 static void setPassword(String password) {
		DBTools.password = password;
	}
	 
	 public static String getSqlType() {
		return sqlType;
	}

	 static void setSqlType(String sqlType) {
		DBTools.sqlType = sqlType;
	}

	public static StudentDao newStudentDao() {
			switch(DBTools.getSqlType()) {
			case SQL_TYPE_MYSQL:
				return new MySqlStudentDaoImp();
			case SQL_TYPE_MSSQL:
				return new MsSqlStudentDaoImp();
			}
		 return new MySqlStudentDaoImp();
	 }
	
	
}
