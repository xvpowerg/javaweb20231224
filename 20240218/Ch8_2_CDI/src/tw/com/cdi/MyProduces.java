package tw.com.cdi;

import java.util.ArrayList;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

import tw.com.bean.MyApple;

public class MyProduces {
	
	@Produces
	@Named("redApple")
	private MyApple getReadApple() {
		MyApple myApple = new MyApple();
		myApple.setName("Red Apple");
		myApple.setPrice(25);
		return myApple;
	}
	
	@Produces
	@Named("greenApple")
	private MyApple getGreenApple() {
		MyApple myApple = new MyApple();
		myApple.setName("Green Apple");
		myApple.setPrice(10);
		return myApple;
	}
	
	@Produces
	@YeallowApple
	public MyApple getYellowApple() {
		MyApple myApple = new MyApple();
		myApple.setName("Yellow Apple");
		myApple.setPrice(30);
		return myApple;
	}
	
	@Produces
	@Named("nameList")
	private ArrayList<String> getNameList() {
			ArrayList<String> list = new ArrayList();
			list.add("Ken");
			list.add("Vivin");
			list.add("Lucy");
			return list;
			
	}
}
