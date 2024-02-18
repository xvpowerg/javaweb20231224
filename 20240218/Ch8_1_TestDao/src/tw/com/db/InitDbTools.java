package tw.com.db;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitDbTools implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		String user = context.getInitParameter("db_account");
		String password = context.getInitParameter("db_password");
		String url = context.getInitParameter("db_url");
		String sqlType = context.getInitParameter("sql_type");
		DBTools.setUser(user);
		DBTools.setUrl(url);
		DBTools.setPassword(password);
		DBTools.setSqlType(sqlType);
	}
}
