package com.deloitee.cms.model;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.jasper.el.JspELException;

public class CustomTagAdd extends TagSupport {


	public int doStartTag() throws JspELException, JspException
	{
		JspWriter out =pageContext.getOut();
		try
		{
			out.println("chennai");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}
}
