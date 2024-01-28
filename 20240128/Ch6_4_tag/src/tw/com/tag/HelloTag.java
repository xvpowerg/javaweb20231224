package tw.com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloTag implements Tag {
	private Tag parent;
	private PageContext pageContext;
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter out =	this.pageContext.getOut();
		try {
			out.println("<font szie='5' color='red'>�j�a�nEnd</font>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		 JspWriter out = this.pageContext.getOut();
		 try {
			 out.println("<font size='5' color='blue'>�j�a�nStart</font>");
		 }catch(IOException ex) {
			 System.out.println(ex);
		 }
		return EVAL_PAGE;//���槹�ثe�����٭n�����Ljsp���{��
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPageContext(PageContext context) {
		// TODO Auto-generated method stub
		this.pageContext = context;
	}

	@Override
	public void setParent(Tag p) {
		// TODO Auto-generated method stub
		this.parent = p;
	}
	
	

}
