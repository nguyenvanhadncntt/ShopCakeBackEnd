package com.khongcoai.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.khongcoai.bean.Cake;
import com.khongcoai.bo.CakeBO;

@RestController
public class InforCake {
	@Autowired 
	ServletContext context;
	
	@RequestMapping("inforCake")
	@ResponseBody
	public Cake inforCake(@RequestParam("cCake")String cCake,HttpServletResponse response){
		CakeBO cakeBO = new CakeBO();
		return cakeBO.getInforCake(cCake,context);
	}
	
}
