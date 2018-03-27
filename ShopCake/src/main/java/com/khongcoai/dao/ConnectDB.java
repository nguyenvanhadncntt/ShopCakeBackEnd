package com.khongcoai.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	public Connection connect(){
	Connection conn =null;
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/shopcake?useUnicode=true&characterEncoding=utf-8";
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,"root","");
	}catch(Exception e){
		e.printStackTrace();
	}
	return conn;
	}
	
}
