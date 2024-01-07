package tw.com.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class CharsetFilter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest req, 
			HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		res.setContentType("text/html;charset=utf-8");
		chain.doFilter(req, res);
	
	}
}
