package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.bean.Counter;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =  resp.getWriter();
		HttpSession session =   req.getSession();
		Counter counter =  (Counter)session.getAttribute("myCounter");
		if (counter == null) {
			counter = new Counter();
			session.setAttribute("myCounter", counter);
		}
		counter.add();
		out.println("<html>");
		out.println("<body>");
		out.println("<a href='page2'>Page2</a>|");
		out.println("<a href='page1'>Page1</a>");
		out.println("<p>Page1:"+counter.getCount()+"</p>");
		out.println("</body>");
		out.println("</html>");
	}
}
