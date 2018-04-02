package com.service;

import java.util.List;
import java.util.Set;
import com.model.Admin;

public interface AdminService {
	
	
	public void add(Admin admin);
	
	public void remove(int aid);
	
	public void edit(Admin admin);
	
	public List<Admin> query();
	
	public Admin getAdminById(int aid);

	public Admin getAdminByName(String username) ;
	
	public Set<String> getRoleNameSet(Admin admin);
	
	public Set<String> getPermissionNamesSet(Admin admin);
}
