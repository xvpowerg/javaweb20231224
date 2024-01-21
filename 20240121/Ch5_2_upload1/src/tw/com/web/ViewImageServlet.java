package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/view_images")
public class ViewImageServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out =   resp.getWriter();
		String fileDir = "c:\\upload_images";
		Path filePath = Paths.get(fileDir);
	List<String> imgList =  Files.list(filePath).
			map(p->p.getFileName().toString()).
		collect(Collectors.toList());
	
	out.println("<html>");
	out.println("<body>");
	for (String img : imgList) {
		out.println("<div>");
		out.println("<img width='30%' height='30%' src='/myimages/"+img+"' >");
		out.println("</div>");
		}
	out.println("<body>");
	out.println("</html>");
	}
}
