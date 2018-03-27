package com.khongcoai.controllers;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.khongcoai.bean.Cake;
import com.khongcoai.bo.CakeBO;

@RestController
public class CRUDControllers {
	
	@Autowired
	HttpSession session;
	
	@Autowired 
	ServletContext context;
	
	@RequestMapping("loadDelete")
	@ResponseBody
	public Cake loadDeleteCake(@RequestParam("cCake") String cCake) {
//		if (session.getAttribute("user") != null) {
			CakeBO cakeBO = new CakeBO();
			return cakeBO.getInforCake(cCake,context);
//		}
//		return null;
	}

	@RequestMapping("deleteCake")
	public void deleteCake(@RequestParam("cCake") String cCake) {
//		if (session.getAttribute("user") != null) {
			CakeBO cakeBO = new CakeBO();
			cakeBO.deleteCake(cCake);
//		}
	}

	@RequestMapping("loadEdit")
	@ResponseBody
	public Cake loadCake(@RequestParam("cCake") String cCake ) {
//		if (session.getAttribute("user") != null) {
			CakeBO cakeBO = new CakeBO();
			return cakeBO.getInforCake(cCake,context);
//		}
//		return null;
	}

	@RequestMapping("editCake")
	public void editCake(@RequestParam("nCake") String nCake, @RequestParam("cCake") String cCake,
			@RequestParam("price") String price,@RequestParam("file") MultipartFile file,
			@RequestParam("detail") String detail, HttpServletRequest request,HttpServletResponse response) {
//		if (session.getAttribute("user") != null) {
		try {
			CakeBO cakeBO = new CakeBO();
			Cake cake = new Cake();
			cake.setcCake(cCake);
			cake.setnCake(nCake);
			cake.setPrice(Long.parseLong(price));
			cake.setImage(file.getOriginalFilename());
			cake.setDetail(detail);
			cakeBO.editCake(cake, file, request);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//	}
	}
	@RequestMapping("listCake")
//	@ResponseBody
	public ArrayList<Cake> loadListCake() {
//		if (session.getAttribute("user") != null) {
			CakeBO cakeBO = new CakeBO();
			return cakeBO.getListCake(context);
//		}
//		else{
//			System.out.println("No");
//		}
//		return null;
	}

	@RequestMapping("loadInsertCake")
	public String loadInsertCake() {
		return "insertCake";
	}

	@RequestMapping(value = "insertCake")
	public void insertCake(@RequestParam("nCake") String nCake, @RequestParam("cCake") String cCake,
			@RequestParam("price") String price,@RequestParam("file") MultipartFile file,
			@RequestParam("detail") String detail,HttpServletRequest request) {
//		if (session.getAttribute("user") != null) {
			try {
				CakeBO cakeBO = new CakeBO();
				Cake cake = new Cake();
				cake.setcCake(cCake);
				cake.setnCake(nCake);
				cake.setPrice(Long.parseLong(price));
				cake.setImage(file.getOriginalFilename());
				cake.setDetail(detail);
				cakeBO.insertCake(cake, file, request);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//	}
}
