package tw.com.bean;

public class Student  {
	private int id;
	private String stName;
	private int score1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getScore1() {
		return score1;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", stName=" + stName + ", score1=" + score1 + "]";
	}
	
	
}
