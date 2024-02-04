package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MySimpleTagHandler extends SimpleTagSupport{

	private String url;
	private boolean showBoder = false;
	private boolean showUrl = false;
	
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public boolean isShowBoder() {
		return showBoder;
	}




	public void setShowBoder(boolean showBoder) {
		this.showBoder = showBoder;
	}




	public boolean isShowUrl() {
		return showUrl;
	}




	public void setShowUrl(boolean showUrl) {
		this.showUrl = showUrl;
	}




	@Override
	public void doTag() throws JspException, IOException {
	  	PageContext  pcx = (PageContext)getJspContext();
	  	JspWriter  out =  pcx.getOut();
	  	StringBuffer sb = new StringBuffer();
	  	if (showUrl) {
	  		sb.append("<h3>");
	  		sb.append(url);
	  		sb.append("</h3>");
	  	}
	  	sb.append("<img width='200px' height='200px' ");
	  	if(showBoder) {
	  		sb.append("border = '1' ");
	  	}
	  	sb.append("src='");
	  	sb.append(url);
	  	sb.append("'/>");
	  	System.out.println(sb);
	  	out.println(sb);
	  	
	  	
	}
	
}
