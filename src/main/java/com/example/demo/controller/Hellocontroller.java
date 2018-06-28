package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
}
