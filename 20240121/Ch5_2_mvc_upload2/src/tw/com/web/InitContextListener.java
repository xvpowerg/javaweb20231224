package tw.com.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import tw.com.tools.ImageTools;

@WebListener
public class InitContextListener implements ServletContextListener {
		@Override
		public void contextInitialized(ServletContextEvent sce) {
			ServletContext context = sce.getServletContext();
			String filePath = context.getInitParameter("file_path");
			ImageTools.setImagePath(filePath);
			// TODO Auto-generated method stub
			System.out.println("InitContextListener contextInitialized!!"+filePath);
		}
}
