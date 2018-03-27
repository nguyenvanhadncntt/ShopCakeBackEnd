package com.khongcoai.bean;

public class User {
	private String name;
	private String username;
	private String password;
	private String address;
	private String role;
	
	public User() {
		super();
	}
	public User(String name, String username, String password, String address, String role) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.role = role;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
