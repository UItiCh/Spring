package com.HG.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.HG.pojo.User;
import com.HG.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String login(User user, Model model) {

		model.addAttribute("user", user);
		return "login";
	}

	@RequestMapping(value = "/loginDo",method = {RequestMethod.POST})
	public String loginDo(User user,Model model,HttpServletRequest request) {
		
		User u = userService.getUserByUsernameAndPassword(user);
		System.out.println(u);
		if(u!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("USER_MSG", u);
			return  "redirect:/customerList";
		}else {
			
			model.addAttribute("user", user);
			model.addAttribute("errMsg", "用户名或者密码");
			
			System.out.println("hello ");
			
			return "login";
		}
	}
}
