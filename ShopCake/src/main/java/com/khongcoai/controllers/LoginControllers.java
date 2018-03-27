package com.khongcoai.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.khongcoai.bean.User;
import com.khongcoai.bo.UserBO;

@RestController
public class LoginControllers {
	@Autowired
	ServletContext context;
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="checkLogin",method=RequestMethod.GET)
	public User checkLogin(@RequestParam("username")String username,@RequestParam("password")String pass,HttpServletRequest resquest){
		UserBO userBO = new UserBO();
		if(userBO.checkLogin(username, pass)){
			User user =userBO.getUser(username, pass);
			session.setAttribute("user", user);
			return user;
		}
		return new User();
	}
}
