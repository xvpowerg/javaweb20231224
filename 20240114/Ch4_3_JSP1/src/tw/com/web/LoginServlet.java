package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		//session 登入成功 isPass true 失敗pass false
		//test_session.jsp 如果session是isPass 顯示Pass 否則顯示 Fail
			String acc = req.getParameter("acc");
			String pwd = req.getParameter("pwd");
			HttpSession session = req.getSession();
			if (acc.equals("qwer") && pwd.equals("12345")) {
				session.setAttribute("isPass", true);
			}else {
				session.setAttribute("isPass", false);
			}
			
			req.getRequestDispatcher("test_session.jsp").forward(req, resp);
		}
		
}
