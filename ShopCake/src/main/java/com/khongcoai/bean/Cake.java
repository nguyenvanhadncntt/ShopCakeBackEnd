package com.khongcoai.bean;

public class Cake {
	private String cCake;
	private String nCake;
	private long price;
	private String image;
	private String detail;
	
	public Cake() {
		super();
	}
	public Cake(String cCake, String nCake, long price, String image, String detail) {
		super();
		this.cCake = cCake;
		this.nCake = nCake;
		this.price = price;
		this.image = image;
		this.detail = detail;
	}
	public String getcCake() {
		return cCake;
	}
	public void setcCake(String cCake) {
		this.cCake = cCake;
	}
	public String getnCake() {
		return nCake;
	}
	public void setnCake(String nCake) {
		this.nCake = nCake;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
}
