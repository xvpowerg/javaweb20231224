package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.jfr.Name;
import tw.com.bean.MyApple;
import tw.com.cdi.YeallowApple;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
	//CDI¡]Contexts and Dependency Injection¡^
	@Inject
	@Named("redApple")
	private MyApple apple1;
	
	@Inject
	@Named("greenApple")
	private MyApple apple2;
	
	@Inject
	@YeallowApple
	private MyApple apple3;
	@Inject
	@Named("nameList")
	private ArrayList<String> myList;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(apple1);
		System.out.println(apple2);
		System.out.println(apple3);
		System.out.println(myList);
	}
}
