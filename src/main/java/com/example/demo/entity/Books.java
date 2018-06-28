package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*名字
作者
价格
出版社
作者的电话
作者的住址
类型：小说
题材：言情，军事
出版时间: data=1999/12/22*/
@Entity
public class Books {
	
	@Id 
	@GeneratedValue
	private Integer pId;
	private String name;
	private String anther;
	private Double price;
	private String press;
	private String phone;
	private String adress;
	private String rype;
	private String theme;
	private String outime;
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnther() {
		return anther;
	}
	public void setAnther(String anther) {
		this.anther = anther;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getRype() {
		return rype;
	}
	public void setRype(String rype) {
		this.rype = rype;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getOutime() {
		return outime;
	}
	public void setOutime(String outime) {
		this.outime = outime;
	}
	
	
	 
	

}
