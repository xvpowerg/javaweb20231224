package tw.com.web;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import java.time.LocalDateTime;
@WebListener
public class MyHttpSessionListener  implements HttpSessionAttributeListener{
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String key = event.getName();
		if (key.equals("isLogin")) {
			LocalDateTime dataTime = LocalDateTime.now();
			System.out.println("Lgoin:"+dataTime);
		}
	}
	
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub
		String key = event.getName();
		if (key.equals("isLogin")) {
			LocalDateTime dataTime = LocalDateTime.now();
			System.out.println("Logout:"+dataTime);
		}
	}

}
