package tw.com.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/p1/*")
public class P1Filter extends HttpFilter{
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, 
			FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		 HttpSession session =   req.getSession();
		 Object obj =  session.getAttribute("login");
		 if (obj == null) {
			 res.sendRedirect("../p2/login.html"); 
			 return;
		 }
		 chain.doFilter(req, res); 
		 
	}
}
