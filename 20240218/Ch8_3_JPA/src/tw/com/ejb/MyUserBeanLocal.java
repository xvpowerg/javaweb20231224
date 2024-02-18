package tw.com.ejb;

import javax.ejb.Local;

import tw.com.jpa.MyUser;

@Local
public interface MyUserBeanLocal {
	public boolean login(MyUser myuser);
	public boolean register(MyUser myuser);
	public MyUser findUserByAccAndPwd(String account,String password);
	public boolean deleteUser(MyUser myUser);
}
