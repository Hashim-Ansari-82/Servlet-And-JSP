package com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Welcome extends TagSupport{

	private static final long serialVersionUID = 1L;
	
	public String msg;

	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out = pageContext.getOut();
		try {
			out.println("<h1>"+msg+"</h1>");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
