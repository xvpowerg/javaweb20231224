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

@WebServlet("/page6")
public class Page6Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer show_image =Integer.parseInt(req.getParameter("show_image"));
		req.setAttribute("show_image", show_image);
		req.getRequestDispatcher("/page6.jsp").forward(req, resp);
		
	}
}
