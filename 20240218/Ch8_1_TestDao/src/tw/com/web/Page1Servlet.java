package tw.com.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.bean.Student;
import tw.com.db.DBTools;
import tw.com.db.StudentDao;


@WebServlet("/page1")
public class Page1Servlet extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			StudentDao stDao =  DBTools.newStudentDao();
			System.out.println(stDao);
//			stDao.createStudent("Vivin", 85);
//			Student st2 = stDao.findStudent(2);
//			System.out.println(st2);
		}
}
