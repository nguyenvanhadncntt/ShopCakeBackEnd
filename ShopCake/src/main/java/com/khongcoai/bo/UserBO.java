package com.khongcoai.bo;

import com.khongcoai.bean.User;
import com.khongcoai.dao.UserDAO;

public class UserBO {
	UserDAO userDAO = new UserDAO();
	public boolean checkLogin(String username,String password){
		return userDAO.checkLogin(username, password);
	}
	
	public User getUser(String username,String password){
		return userDAO.getUser(username, password);
	}
}
