package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.db.DbTools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			try {
				System.out.println(DbTools.getConnection());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
//			String url = "jdbc:mysql://localhost:3306/testdb20240204?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true";
//			String user = "root";
//			String password = "123456";
//			try(Connection conn =  DriverManager.getConnection(url,user,password)){
//				
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				System.out.println("E:"+e);
//			}
			
			
		}
}
