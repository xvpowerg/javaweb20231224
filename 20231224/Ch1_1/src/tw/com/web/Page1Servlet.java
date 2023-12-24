package tw.com.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,
			HttpServletResponse resp)throws IOException {
		PrintWriter out =   resp.getWriter();
		Enumeration<String> header = req.getHeaderNames();
		String name = header.nextElement();
		while ( (name != null) ) {
			System.out.println("Name:"+name+
					" value:"+req.getHeader(name));
			name = header.nextElement();
		}
		out.println("<html>");
		out.println("<body>");
			 out.println("<a>");
			 out.println("Hello!");
			 out.println("</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
