package tw.com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tw.com.bean.Student;

public class MySqlStudentDaoImp implements StudentDao {
	MySqlStudentDaoImp(){}
	@Override
	public boolean createStudent(String name, int score) {
		String sql = "INSERT INTO student(stname,score1)VALUES(?,?)";
		try(Connection con = DBTools.getConnection();
			PreparedStatement stm =	con.prepareStatement(sql)){
			stm.setString(1, name);
			stm.setInt(2, score);
			int count = stm.executeUpdate();
			return count > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("ex:"+e);
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM student WHERE id = ?";
		try(Connection con = DBTools.getConnection();
			PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1, id);
			 ResultSet result = stm.executeQuery();
			 if (result.next()) {
				int sid =  result.getInt(1);
				 String name = result.getString(2);
				 int score = result.getInt(3);
				 Student st1 = new Student();
				 st1.setId(sid);
				 st1.setStName(name);
				 st1.setScore1(score);
				 return st1;
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("e:"+e);
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		StudentDao stdao = new MySqlStudentDaoImp();
		DBTools.setUrl("jdbc:mysql://localhost:3306/testdb20240218?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true");
		DBTools.setUser("root");
		DBTools.setPassword("123456");
		Student st1 = stdao.findStudent(1);
		System.out.println(st1);
		//System.out.println(stdao.createStudent("Ken", 25));
	}

}
