package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/page1"},asyncSupported = true)
public class Page1Servlet extends HttpServlet {
	
	private void testRun( AsyncContext ctx)throws IOException {
			
		
			System.out.println("Start:"+Thread.currentThread().getName());
			
			try {
				Thread.sleep(5000);
			}catch(Exception ex) {
				
			}
			
			PrintWriter out = ctx.getResponse().getWriter();
			out.println("End:"+Thread.currentThread().getName());
			System.out.println("End:"+Thread.currentThread().getName());
			ctx.complete();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 AsyncContext ctx =req.startAsync();
		Thread th1 = new Thread(()->{
			try {
				testRun(ctx);
			}catch(Exception ex) {}
			
			
		} ) ;
		th1.start();
		
	}
}
