package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Shop_receive;
import com.service.Shop_receiveService;

@Controller
@RequestMapping("/shop_receive")
public class Shop_receiveController {

	@Autowired
	private Shop_receiveService shop_receiveService;
<<<<<<< HEAD
	/*@RequestMapping("/save")
	public String save(Shop_receive receive) {
=======
	@RequestMapping("/save")
	public void save(Shop_receive receive) {
>>>>>>> branch 'master' of https://github.com/kangxiaomata/mall.git
		shop_receiveService.save(receive);
	    return "redirect:listAllUser";
	}*/
	
    
	@RequestMapping("/listAll")
	public ModelAndView listAll(@RequestParam(required=true,defaultValue="1") Integer page,HttpServletRequest request,Model md) {
		System.out.println("listAll");
		PageHelper.startPage(page, 5);
		ModelAndView mv=new ModelAndView();
		Map map = new HashMap();
		map = initMap(request, map);
		List<Shop_receive> shop_receives = shop_receiveService.listAll(new HashMap(map));
		PageInfo<Shop_receive>  pageInfo = new PageInfo<Shop_receive>(shop_receives);
		mv.setViewName("siteList");
		mv.addObject("page", pageInfo);
		mv.addObject("shop_receives", shop_receives);
		return mv;
	}
	
	private Map initMap(HttpServletRequest request,Map map) {
		String receive_name = request.getParameter("receive_name");
		map.put("receive_name", receive_name);
		if (receive_name!=null) {
			request.setAttribute("receive_name", receive_name);
		}
		return map;
	}
}
