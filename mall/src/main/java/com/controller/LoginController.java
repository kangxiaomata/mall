package com.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.model.Admin;
import com.service.AdminService;

@Controller
public class LoginController {

	@Autowired
	private AdminService as;
	
	
	@RequestMapping(value="/checkAdmin")
	public ModelAndView login(ModelAndView mv,Admin admin){
		System.out.println(admin);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(admin.getUsername(), admin.getPassword());
		token.setRememberMe(true);
		if (!subject.isAuthenticated()) {
			try{
			    subject.login(token);
			}catch(Exception e){
				e.printStackTrace();
				mv.setViewName("login");
				return mv;
			}
		}
		subject.hasRole("");
//		Admin user = as.getAdminByName(admin.getUsername());
//		System.out.println(user.getAid());
//		session.setAttribute("user",user);
		mv.setViewName("index");
		return mv;
	}
	
}
