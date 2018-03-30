package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mapper.AdminMapper;
import com.model.Admin;

@Repository
public class AdminDao {
	
	
/*	public void add(Admin admin);
	
	public void remove(int aid);
	
	public void edit(Admin admin);
	
	public List<Admin> query();
	
	public Admin getAdminById(int aid);*/
	
	@Autowired
	private AdminMapper mapper;
	
	public void add(Admin admin){
		mapper.add(admin);
	}
	
	public void remove(int aid){
		mapper.remove(aid);
	}
	
	public void edit(Admin admin){
		mapper.edit(admin);
	}
	
	public List<Admin> query(){
		List<Admin> list = mapper.query();
		return list;
	}
	
	public Admin getAdminById(int aid){
		Admin admin = mapper.getAdminById(aid);
		return admin;
	}

	public Admin getAdminByName(String username) {
		return mapper.getAdminByName(username);
	}

}
