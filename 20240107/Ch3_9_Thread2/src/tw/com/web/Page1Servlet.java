package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
		private ExecutorService es;
		@Override
		public void init() throws ServletException {
		// TODO Auto-generated method stub
			es = Executors.newCachedThreadPool();
		}
		private void test(HttpServletResponse resp) throws IOException {
			System.out.println("開始點菜:"+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			}catch(Exception ex) {
				
			}
			resp.getWriter().println("finish:"+Thread.currentThread().getName());
			System.out.println("完成點菜:"+Thread.currentThread().getName());
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			 PrintWriter out =  resp.getWriter();
			 System.out.println("Page1 Start:"+Thread.currentThread().getName());
			 out.println("Page1 Start:"+Thread.currentThread().getName());
			 es.execute(()->{
				 try {
					test(resp);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 });
			
			 out.println("Page1 End:"+Thread.currentThread().getName());
			 System.out.println("Page1 End:"+Thread.currentThread().getName());
		}
}
