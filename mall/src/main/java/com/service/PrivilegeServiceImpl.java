package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PrivilegeDao;
import com.model.Privilege;

@Service
public class PrivilegeServiceImpl implements PriviligeService{
	
/*	public void add(Privilege privilege);
	
	public void remove(int priId);
	
	public void edit(Privilege privilege);
	
	public List<Privilege> query();
	
	public Privilege getPrivilegeById(int priId);
	
	public List<Privilege> getPrivilegeByRoleId(int roleId);*/
	
	@Autowired
	private PrivilegeDao dao;

	public void add(Privilege privilege){
		if (privilege!=null && privilege.getPriName() != null) {
			dao.add(privilege);
		}
	}
	
	public void remove(int priId){
		if (priId > 0) {
			dao.remove(priId);
		}
	}
	
	public void edit(Privilege privilege){
		if (privilege!=null && privilege.getPriId() > 0 ) {
			dao.edit(privilege);
		}
	}
	
	public List<Privilege> query(){
		Map map = new HashMap<>();
		map.put("priNode", 1);
		return dao.query(map);
	}
	
	public List<Privilege> queryMenu(){
		Map map = new HashMap<>();
		map.put("priNode", 1);
		map.put("priType", 1);
		return dao.query(map);
	}
	
	public Privilege getPrivilegeById(int priId){
		if (priId > 0) {
			return dao.getPrivilegeById(priId);
		}
		return null;
	}
	
	public List<Privilege> getPrivilegeByRoleId(int roleId){
		if (roleId > 0) {
			return dao.getPrivilegeByRoleId(roleId);
		}
		return null;
	}
	
}
