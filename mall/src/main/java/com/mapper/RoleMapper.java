package com.mapper;

import java.util.List;

import com.model.Role;

public interface RoleMapper {


	public void add(Role role);
	
	public void remove(int roleId);
	
	public void edit(Role role);
	
	public List<Role> query();
	
	public Role getRoleById(int roleId);
	
	public List<Role> listRole();
}
