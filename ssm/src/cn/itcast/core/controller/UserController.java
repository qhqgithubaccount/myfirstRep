package cn.itcast.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping("saveUser")
	public String saveUser(User user){
		userService.saveUser(user);
		return "list";
	}
	@RequestMapping("index")
	public String indexUI(){
		return "insert";
	}
}
