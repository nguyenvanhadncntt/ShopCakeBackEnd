package com.khongcoai.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogOutController {
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="logout")
	public void logout(){
		if(session.getAttribute("user")!=null){
		session.removeAttribute("user");
		}
	}
}
