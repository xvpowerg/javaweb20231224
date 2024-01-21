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
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String countStr = req.getParameter("count");
			PrintWriter out = resp.getWriter();
			int count = Integer.parseInt(countStr);
			out.println("<html>");
			out.println("<body>");
			 out.println("<ol>");
			 char c1 = 'A';
			 	for (int i = 0; i<count;i++) {
			 		out.println("<li>");
			 			out.println( (char)(c1+i));
			 		out.println("</li>");
			 	}
			 out.println("</ol>");
			out.println("</body>");
			out.println("</html>");
			
		}
}
