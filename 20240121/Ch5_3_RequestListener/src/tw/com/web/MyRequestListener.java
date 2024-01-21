package tw.com.web;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestListener implements ServletRequestAttributeListener{
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
	     String name = srae.getName();
	     String value = srae.getValue().toString();
	     System.out.println(name+":"+value);
	
	}
	
	@Override
	public  void attributeReplaced(ServletRequestAttributeEvent srae) {
		 String name =  srae.getName();
		 String value = srae.getValue().toString();
		 String newValue = 
				 srae.getServletRequest().getAttribute(name).toString();
		 System.out.println("Replaced:"+name+":"+value+":"+newValue);
		
	}
	
	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		String name = srae.getName();
		String value = srae.getValue().toString();
		System.out.println("Remove:"+name+":"+value);
	}
	
}
