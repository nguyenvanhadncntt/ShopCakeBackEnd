package com.khongcoai.controllers;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.khongcoai.bean.Cake;
import com.khongcoai.bo.CakeBO;

@RestController
public class SearchControllers {
	
	@Autowired 
	ServletContext context;
	
	@RequestMapping("searchCakeAdmin")
	@ResponseBody
	public ArrayList<Cake> searchCakeAdmin(@RequestParam("nameCake")String nameCake,ModelMap model,HttpSession session){
//		if(session.getAttribute("user")!=null){
		CakeBO cakeBO = new CakeBO();
		return cakeBO.searchCake(nameCake,context);
//		}
//		return null;
	}
	
}
