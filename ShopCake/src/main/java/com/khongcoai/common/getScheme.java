package com.khongcoai.common;

import javax.servlet.ServletContext;

public class getScheme {
	public String getContextImg(String image,ServletContext context ){
		return "http://localhost:8080/"+context.getContextPath()+"/resources/images/"+image;
	}
}
