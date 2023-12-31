package tw.com.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page1")
public class Page1Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String toPage =  req.getParameter("to_page");
		System.out.println(toPage);
		ArrayList<String> list = new ArrayList<>();
		list.add("Ken");
		list.add("Vivin");
		list.add("Lucy");
		req.setAttribute("nameList",list);
		
		//三個域 變數的存活區域
		//page to page
		//user
		//整個web應用
		if (toPage.equals("2")) {
			req.getRequestDispatcher("/page2").
			forward(req, resp);
		}else if(toPage.equals("3")) {
			req.getRequestDispatcher("/page3").
			forward(req, resp);
		}
	}
}
