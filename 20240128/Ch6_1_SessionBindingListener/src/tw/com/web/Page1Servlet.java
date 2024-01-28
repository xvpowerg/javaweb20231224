package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.MyUser;

@WebServlet("/page1")
public class Page1Servlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean login = Boolean.parseBoolean(req.getParameter("login"));
	    PrintWriter out = resp.getWriter();
		HttpSession session =   req.getSession();
		if (login) {
			String name = req.getParameter("name");
			MyUser myUser = new MyUser();
			myUser.setNmae(name);
			session.setAttribute("MyUser", myUser);
			out.println("Login");
		}else {
			//logout
			session.removeAttribute("MyUser");
			out.println("Logout");
		}
	}
}
