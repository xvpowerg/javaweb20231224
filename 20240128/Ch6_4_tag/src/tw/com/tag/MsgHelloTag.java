package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class MsgHelloTag extends TagSupport {
	private String message;
	private String count;
	
	
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		PageContext pageContext = this.pageContext;
		JspWriter out = pageContext.getOut();
		String msg = String.format("<font size='6' color='red'>%s你好 數量:%s</font>", message,count);
		try {
			out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	
}
