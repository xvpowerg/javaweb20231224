package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			HttpSession session = req.getSession();
			session.removeAttribute("isLogin");
			PrintWriter out =   resp.getWriter();
			
			out.println("<html>");
				out.println("<body>");
					out.println("<h2>Logout</h2>");
					out.println("<a href='index.html'>Home</a>");
				out.println("</body>");	
			out.println("<html>");
		}
}
