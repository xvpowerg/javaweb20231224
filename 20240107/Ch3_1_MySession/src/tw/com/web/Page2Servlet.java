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

@WebServlet("/page2")
public class Page2Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =   resp.getWriter();
		MyHttpSession myHttpSession =  WebTools.getMySession(req, resp);
		String user = (String)myHttpSession.getAttribute("user");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Page2</h1>");
		out.println("<a href='page1'>page1");
		out.println("<p>user:"+user+"</p>");
		out.println("</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
