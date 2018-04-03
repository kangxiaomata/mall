package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RoleDao;
import com.model.Role;

@Service
public class RoleServiceImpl implements RoleService{
	
/*	public void add(Role role);
	
	public void remove(int roleId);
	
	public void edit(Role role);
	
	public List<Role> query();
	
	public Role getRoleById(int roleId);*/
	
	@Autowired
	private RoleDao dao;
	
	public void add(Role role){
		if (role != null && role.getRoleName()!=null) {
			dao.add(role);
		}
	}

	public void remove(int roleId){
		if (roleId > 0) {
			dao.remove(roleId);
		}
	}
	
	public void edit(Role role){
		if (role!=null && role.getRoleId() > 0) {
			dao.edit(role);
		}
	}
	
	public List<Role> query(){
		return dao.query();
	}
	
	public Role getRoleById(int roleId){
		if (roleId > 0) {
			return dao.getRoleById(roleId);
		}
		return null;
	}
	
	public List<Role> listRole(){
		return dao.listRole();
	}
	
}
