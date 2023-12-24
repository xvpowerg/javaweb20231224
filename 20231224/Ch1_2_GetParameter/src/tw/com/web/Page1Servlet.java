package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	
	private void showList(String countStr,PrintWriter out ) {
		if (countStr == null) {
			out.println("<a>Empty</a>");
			return;
		}
		int x =Integer.parseInt(countStr) ;
		out.println("<h2>count:"+countStr+"</h2>");
		out.println("<ul>");
		
			for (int i = 1; i <= x;i++) {
				out.println("<li>"+i+"</li>");
			}
	}
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		String countStr = req.getParameter("count");
		PrintWriter out = resp.getWriter();
		//out.println("Page1");

		out.println("<html>");
		out.println("<body>");
		showList(countStr,out);
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}
}
