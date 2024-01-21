package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tw.com.beans.MyItem;
import tw.com.beans.MyUser;

@WebServlet("/page4")
public class Page4Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<MyUser> arrayList = new ArrayList<>();
		MyUser user1 = new MyUser("Lucy",10);
		MyUser user2 = new MyUser("Joy",20);
		MyUser user3 = new MyUser("Ken",25);
		arrayList.add(user1);
		arrayList.add(user2);
		arrayList.add(user3);
		req.setAttribute("userList", arrayList);
		req.getRequestDispatcher("/page4.jsp").forward(req, resp);
		
		
		
	}
}
