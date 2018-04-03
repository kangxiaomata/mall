package com.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.model.Admin;
import com.model.Role;
import com.service.AdminService;
import com.service.RoleService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService asp;
	private RoleService rsp;

	@RequestMapping("/query")
	public ModelAndView query(ModelAndView mv){
		List<Admin> admins = asp.query();
		mv.addObject("admins", admins);
		mv.setViewName("adminCtrl");
		return mv;
	}
	
	
	@RequestMapping("/delete/{aid}")
	public ModelAndView delete(ModelAndView mv,@PathVariable("aid")int aid){
		asp.remove(aid);
		mv.setViewName("redirect:/admin/query");
		return mv;
	}
	
	@RequestMapping("/toEdit/{aid}")
	public ModelAndView toEdit(ModelAndView mv,@PathVariable("aid")int aid){
		List<Role> roles = rsp.listRole();
		Admin admin = asp.getAdminById(aid);
		mv.addObject("user", admin);
		System.out.println(roles);
		mv.addObject("roles", roles);
		mv.setViewName("adminInfo");
		return mv;
	}
	
	
	
}
