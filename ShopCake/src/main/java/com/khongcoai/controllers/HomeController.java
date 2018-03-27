package com.khongcoai.controllers;

import java.util.ArrayList;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.khongcoai.bean.Cake;
import com.khongcoai.bo.CakeBO;

@RestController
public class HomeController {

	
	@Autowired 
	ServletContext context;
	
	@RequestMapping("home")
	@ResponseBody
	public ArrayList<Cake> loadHome(){
		CakeBO cakeBO =new CakeBO();
		return cakeBO.getFastCake(context);
	}	
	
	@RequestMapping("banhMoi")
	@ResponseBody
	public ArrayList<Cake> newCake(){
		CakeBO cakeBO =new CakeBO();
		return cakeBO.getNewCake(context);
	}	
}
