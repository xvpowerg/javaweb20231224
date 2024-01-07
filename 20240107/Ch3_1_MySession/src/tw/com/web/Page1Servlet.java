package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.web.http.MyHttpSession;
import tw.com.web.http.WebTools;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =   resp.getWriter();
		MyHttpSession myHttpSession =  WebTools.getMySession(req, resp);
		myHttpSession.setAttribute("user", "Vivin");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Page1</h1>");
		out.println("<a href='page2'>page2");
		out.println("</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
