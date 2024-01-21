package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session =  req.getSession();
		session.setAttribute("count", 5);
		if (session.getAttribute("isLogin") == null) {
			session.setAttribute("isLogin", true);
		}
		PrintWriter out =   resp.getWriter();
		out.println("<html>");
			out.println("<body>");
				out.println("<h2>Login</h2>");
				out.println("<a href='index.html'>Home</a>");
			out.println("</body>");	
		out.println("<html>");
		
	}
}
