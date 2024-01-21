package tw.com.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.MyItem;
import tw.com.beans.MyUser;

@WebServlet("/page3")
public class Page3Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		MyUser user1 = new MyUser("Ken",18);
		MyUser user2 = new MyUser("Vivin",25);
		Map<String,MyUser> userMap = new HashMap<>();
		userMap.put("user1_Ken", user1);
		userMap.put("user2 Vivin", user2);
		req.setAttribute("userMap", userMap);
		req.getRequestDispatcher("/page3.jsp").forward(req, resp);
		
		
		
	}
}
