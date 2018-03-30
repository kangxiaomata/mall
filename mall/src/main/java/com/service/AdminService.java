package com.service;

import java.util.List;
import com.model.Admin;

public interface AdminService {
	
	public void add(Admin admin);
	
	public void remove(int aid);
	
	public void edit(Admin admin);
	
	public List<Admin> query();
	
	public Admin getAdminById(int aid);

	public Admin getAdminByName(String username) ;
	
}
