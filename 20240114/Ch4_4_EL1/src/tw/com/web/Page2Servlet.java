package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.MyItem;
import tw.com.beans.MyUser;

@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyItem it1 = new MyItem("MyItem",100);
		MyUser user1 = new MyUser("MyUser",25);
		req.setAttribute("Item1", it1);
		HttpSession session =  req.getSession();
		session.setAttribute("User1", user1);
		req.getRequestDispatcher("/page2.jsp").forward(req, resp);
		
		
	}
}
