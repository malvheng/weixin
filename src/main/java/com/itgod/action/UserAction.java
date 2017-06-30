package com.itgod.action;

import com.itgod.entity.User;
import com.itgod.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserAction {
	private final Logger logger =Logger.getLogger(UserAction.class);
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/hello.do")
	public String helloTwo(){
		System.out.println("hello word !");
		return "hello";
	}
	
	@RequestMapping("getId.do")
	public String queryUser(int id,Model model){
		User user = userService.getUserById(id);
	model.addAttribute("user", user);
	return "show";
	}

}
