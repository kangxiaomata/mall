package com.mapper;

import java.util.List;

import com.model.Privilege;


public interface PrivilegeMapper {
	
	public void add(Privilege privilege);
	
	public void remove(int priId);
	
	public void edit(Privilege privilege);
	
	public List<Privilege> query();
	
	public Privilege getPrivilegeById(int priId);
	
	public List<Privilege> getPrivilegeByRoleId(int roleId);

}
