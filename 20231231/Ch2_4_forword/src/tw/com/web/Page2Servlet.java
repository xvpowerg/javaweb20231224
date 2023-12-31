package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
@WebServlet("/page2")
public class Page2Servlet extends HttpServlet{
	  @Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter out =   resp.getWriter();
		 out.println("Page2");
		 ArrayList<String> list = (ArrayList) req.getAttribute("nameList");
		 out.println("ArrayList:"+list);
		 
	}
}
