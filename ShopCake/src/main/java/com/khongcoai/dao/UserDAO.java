package com.khongcoai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.khongcoai.bean.User;

public class UserDAO {
	ConnectDB connectDB = new ConnectDB();

	public boolean checkLogin(String username, String password) {
		String sql = "select * from `userinfor` where UserName=? and Password=?";
		Connection conn = connectDB.connect();
		boolean check = false;
		ResultSet rs = null;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			check = rs.next();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (!conn.isClosed()) {

					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return check;
	}

	public User getUser(String username, String password) {
		User user = null;
		Connection conn = connectDB.connect();
		try {
			String sql = "select * from `userinfor` where UserName='" + username + "' and Password='" + password + "'";
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				user = new User();
				user.setName(rs.getString("Name"));
				user.setPassword(rs.getString("Password"));
				user.setUsername(rs.getString("UserName"));
				user.setAddress(rs.getString("Address"));
				user.setRole(rs.getString("Role"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (!conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return user;
	}
}
