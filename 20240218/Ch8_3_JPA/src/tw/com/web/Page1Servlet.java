package tw.com.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.ejb.MyUserBeanLocal;
import tw.com.jpa.MyUser;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet {
//Java Persistence API 
//Object Relational Mapping
	@EJB
	private MyUserBeanLocal myUserBean;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyUser myuser = new MyUser();
		myuser.setAccount("Ken");
		myuser.setPassword("12345");
		boolean pass = myUserBean.register(myuser);
		
		MyUser findMyUser = myUserBean.findUserByAccAndPwd("Ken","12345");
		System.out.println(findMyUser);
		//myUserBean.deleteUser(myuser);
		//System.out.println(pass);
		
	}
}
