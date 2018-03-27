package com.khongcoai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletContext;

import com.khongcoai.bean.Cake;
import com.khongcoai.common.getScheme;

public class CakeDAO {
	
	ConnectDB connectDB = new ConnectDB();
	getScheme imgPath=new getScheme();
	public ArrayList<Cake> getListCake(ServletContext context) {
		ArrayList<Cake> listCake = new ArrayList<Cake>();
		Connection conn = connectDB.connect();
		String sql = "select * from `cake` order by CodeCake DESC";
		try {
			Statement smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			Cake cake;
			while (rs.next()) {
				cake = new Cake();
				cake.setcCake(rs.getString("CodeCake"));
				cake.setnCake(rs.getString("NameCake"));
				cake.setPrice(rs.getLong("Price"));
				cake.setImage(imgPath.getContextImg(rs.getString("Image"), context));
				cake.setDetail(rs.getString("Details"));
				listCake.add(cake);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed()){			
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listCake;
	}

	public ArrayList<Cake> searchCake(String nameCake,ServletContext context) {
		ArrayList<Cake> listCake = new ArrayList<Cake>();
		Connection conn = connectDB.connect();
		String sql = "select * from `cake` where NameCake like '%" + nameCake + "%'";
		try {
			Statement smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			Cake cake;
			while (rs.next()) {
				cake = new Cake();
				cake.setcCake(rs.getString("CodeCake"));
				cake.setnCake(rs.getString("NameCake"));
				cake.setPrice(rs.getLong("Price"));
				cake.setImage(imgPath.getContextImg(rs.getString("Image"), context));
				cake.setDetail(rs.getString("Details"));
				listCake.add(cake);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed()){			
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listCake;
	}

	public Cake getInforCake(String cCake,ServletContext context) {
		Connection conn = connectDB.connect();
		String sql = "select * from `cake` where CodeCake='" + cCake + "'";
		Cake cake = null;
		try {
			Statement smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			rs.next();
			cake = new Cake();
			cake.setcCake(rs.getString("CodeCake"));
			cake.setnCake(rs.getString("NameCake"));
			cake.setPrice(rs.getLong("Price"));
			cake.setImage(imgPath.getContextImg(rs.getString("Image"), context));
			cake.setDetail(rs.getString("Details"));
		} catch (Exception e) {
				e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed()){			
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return cake;
	}

	public void insertCake(Cake cake) {
		Connection conn = connectDB.connect();
		String sql = "insert into `cake` values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, cake.getcCake());
			ps.setString(2, cake.getnCake());
			ps.setLong(3, cake.getPrice());
			ps.setString(4, cake.getImage());
			ps.setString(5, cake.getDetail());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed()){			
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	public void editCake(Cake cake) {
		String sql;
		if (cake.getImage() == null) {
			sql = "update `cake` set NameCake='" + cake.getnCake() + "', Price="
					+ cake.getPrice()+" , Details='"+cake.getDetail()+"' where CodeCake='"+cake.getcCake()+"'";
		} else {
			sql = "update `cake` set NameCake='" + cake.getnCake() + "', Price="
					+ cake.getPrice()+" , Details='"+cake.getDetail()+"',Image='"+cake.getImage()+"' where CodeCake='"+cake.getcCake()+"'";
		}
		Connection conn = connectDB.connect();
		try{
			Statement smt = conn.createStatement();
			smt.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed()){			
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void deleteCake(String cCake) {
		String sql="delete from `cake` where CodeCake='"+cCake+"'";
		Connection conn = connectDB.connect();
		try{
			Statement smt = conn.createStatement();
			smt.executeUpdate(sql);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed()){			
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ArrayList<Cake> getFastCake(ServletContext context) {
		ArrayList<Cake> listCake = new ArrayList<Cake>();
		Connection conn = connectDB.connect();
		String sql = "select * from `cake` order by CodeCake limit 5";
		try {
			Statement smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			Cake cake;
			
			while (rs.next()) {
				cake = new Cake();
				cake.setcCake(rs.getString("CodeCake"));
				cake.setnCake(rs.getString("NameCake"));
				cake.setPrice(rs.getLong("Price"));
				cake.setImage(imgPath.getContextImg(rs.getString("Image"), context));
				cake.setDetail(rs.getString("Details"));
				listCake.add(cake);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed()){			
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listCake;
	}

	public ArrayList<Cake> getNewCake(ServletContext context) {
		// TODO Auto-generated method stub
		ArrayList<Cake> listCake = new ArrayList<Cake>();
		Connection conn = connectDB.connect();
		String sql = "select * from `cake` order by CodeCake desc LIMIT 5";
		try {
			Statement smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			Cake cake;
			
			while (rs.next()) {
				cake = new Cake();
				cake.setcCake(rs.getString("CodeCake"));
				cake.setnCake(rs.getString("NameCake"));
				cake.setPrice(rs.getLong("Price"));
				cake.setImage(imgPath.getContextImg(rs.getString("Image"), context));
				cake.setDetail(rs.getString("Details"));
				listCake.add(cake);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(!conn.isClosed()){			
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listCake;
	}
}
