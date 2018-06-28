package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Books;
import com.example.demo.service.BooksService;

/*用途：将当前类加入到ioc容器 
 * controller  声明这是一个控制器
 * component
 * repository    向数据库存储 数据
 * service       声明这是一个服务*/


@Controller
public class Hellocontroller {
	@RequestMapping("abc")//访问名
	@ResponseBody//将返回值return直接写到页面上 
	
	public String hello() {
		return "<h1>这是我的springMvc</h1>";
	}
	@Resource
	private BooksService BooksService;
	 
	@RequestMapping("insert")
	@ResponseBody
	public Books insert(Books b) {
		return BooksService.inser(b);
		
	}
	@RequestMapping("del")
	@ResponseBody
	public  String delete(Integer id) {
		BooksService.deleteById(id);
		return "删除成功";
	}
	
	@RequestMapping("all")
	@ResponseBody
	public Object findAll() {
		return BooksService.findAll();
		
	}
	@RequestMapping("update")
	@ResponseBody
	public Object update(Integer id,String name,String anther,
			Double price,String press,String phone,String adress,
	String rype, String theme,String outime) {
		Books books = BooksService.findOne(id);
		books.setName(name);
		books.setAnther(anther);
		books.setPrice(price);
		books.setPress(press);
		books.setPhone(phone);
		books.setAdress(adress);
		books.setRype(rype);
		books.setTheme(theme);
		books.setOutime(outime);
		return BooksService.update(books);
		
		
	}
	
}
