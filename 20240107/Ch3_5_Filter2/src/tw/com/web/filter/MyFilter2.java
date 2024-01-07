package tw.com.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/page1")
public class MyFilter2  implements Filter{
		@Override
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
				throws IOException, ServletException {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			System.out.println("MyFilter2 in doFilter");
			chain.doFilter(request, response);
			System.out.println("MyFilter2 out doFilter");
		}
}
