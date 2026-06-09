package com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Demo extends TagSupport{

	private static final long serialVersionUID = 1L;

	public int side;
	
	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out = pageContext.getOut();
		try {
			out.println("<h1> Square Are = "+side*side+"</h1>");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
}
