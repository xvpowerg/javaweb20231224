package tw.com.beans;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.time.LocalDateTime;
public class MyUser  implements HttpSessionBindingListener{
   private String nmae;

	public String getNmae() {
		return nmae;
	}
	
	public void setNmae(String nmae) {
		this.nmae = nmae;
	}

	@Override
	public String toString() {
		return "MyUser [nmae=" + nmae + "]";
	}
	@Override
		public void valueBound(HttpSessionBindingEvent event) {
			// TODO Auto-generated method stub
				MyUser myUser = (MyUser)event.getValue();
				LocalDateTime now = LocalDateTime.now();
				System.out.println(myUser.getNmae()+":login:"+now);
		}
	
	@Override
		public void valueUnbound(HttpSessionBindingEvent event) {
			// TODO Auto-generated method stub
		MyUser myUser = (MyUser)event.getValue();
			LocalDateTime now = LocalDateTime.now();
			System.out.println(myUser.getNmae()+":Logout:"+now);
		}
   
}
