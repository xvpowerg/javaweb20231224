package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.MyItem;
import tw.com.beans.MyUser;

@WebServlet("/page5")
public class Page5Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean canShow = Boolean.parseBoolean(req.getParameter("canShow"));
		
		ServletContext context =
				this.getServletContext();
		context.setAttribute("canShow", canShow);
		req.getRequestDispatcher("/page5.jsp").
		forward(req, resp);
		
		
		
	}
}
