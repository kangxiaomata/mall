package com.service;

import java.util.List;
import com.model.Role;

public interface RoleService {

	public void add(Role role);
	
	public void remove(int roleId);
	
	public void edit(Role role);
	
	public List<Role> query();
	
	public Role getRoleById(int roleId);
	
}
