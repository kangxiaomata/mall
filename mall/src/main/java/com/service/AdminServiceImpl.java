package com.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.AdminDao;
import com.model.Admin;
import com.model.Privilege;


@Service
public class AdminServiceImpl implements AdminService{
	
	
/*	public void add(Admin admin);
	
	public void remove(int aid);
	
	public void edit(Admin admin);
	
	public List<Admin> query();
	
	public Admin getAdminById(int aid);*/
	
	
	@Autowired
	private AdminDao dao;
	
	public void add(Admin admin){
		if (admin != null) {
			if (admin.getUsername()!=null && admin.getPassword()!=null && admin.getRealName()!=null) {
				dao.add(admin);
			}
		}
	}
	
	public void remove(int aid){
		if (aid > 0) {
			dao.remove(aid);
		}
	}
	
	public void edit(Admin admin){
		if (admin != null) {
			if (admin.getUsername()!=null && admin.getPassword()!=null && 
					admin.getRealName()!=null && admin.getAid() > 0) {
				dao.edit(admin);
			}
		}
	}
	
	
	public List<Admin> query(){
		
		List<Admin> list = dao.query();
		
//		for (Admin admin : list) {
//			admin.getRole().setPrivileges(null);
//		}
		return list;
	}
	
	
	public Admin getAdminById(int aid){
		if (aid > 0) {
			Admin admin = dao.getAdminById(aid);
			return admin;
		}
		return null;
	}

	public Admin getAdminByName(String username) {
		if (username != null) {
			return dao.getAdminByName(username);
		}
		return null;
	}

	@Override
	public Set<String> getRoleNameSet(Admin admin) {
		Set<String> set = new HashSet<>();
		if (admin != null) {
			set.add(admin.getRole().getRoleName());
		}
		return set;
	}

	@Override
	public Set<String> getPermissionNamesSet(Admin admin) {
		Set<String> set = new HashSet<>();
		if (admin != null) {
			List<Privilege> list = admin.getRole().getPrivileges();
			for (Privilege privilege : list) {
				set.add(privilege.getPriName());
			}
		}
		return set;
	}
	
}
