package com.khongcoai.bo;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.khongcoai.bean.Cake;
import com.khongcoai.common.WriteFile;
import com.khongcoai.dao.CakeDAO;

public class CakeBO {
	CakeDAO cakeDAO = new CakeDAO();
	public ArrayList<Cake> getListCake(ServletContext context){
		return cakeDAO.getListCake(context);
	}
	public ArrayList<Cake> searchCake(String nameCake,ServletContext context){
		return cakeDAO.searchCake(nameCake,context);
	}
	
	public Cake getInforCake(String cCake,ServletContext context){
		return cakeDAO.getInforCake(cCake,context);
	}
	
	public void insertCake(Cake cake,MultipartFile file,HttpServletRequest request){
		WriteFile wf = new WriteFile();
		wf.copyFile(file, request);
		cakeDAO.insertCake(cake);
	}
	
	public void editCake(Cake cake,MultipartFile file,HttpServletRequest request){
		if(!"".equals(cake.getImage())){
		WriteFile wf = new WriteFile();
		wf.copyFile(file, request);
		}
		cakeDAO.editCake(cake);
	}
	public void deleteCake(String cCake) {
		cakeDAO.deleteCake(cCake);
		
	}
	
	public ArrayList<Cake> getNewCake(ServletContext context){
		return cakeDAO.getNewCake(context);
	}
	
	public  ArrayList<Cake> getFastCake(ServletContext context) {
		// TODO Auto-generated method stub
		return cakeDAO.getFastCake(context);
	}
}
