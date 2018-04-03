package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mapper.RoleMapper;
import com.model.Role;

@Repository
public class RoleDao {
	
/*	public void add(Role role);
	
	public void remove(int roleId);
	
	public void edit(Role role);
	
	public List<Role> query();
	
	public Role getRoleById(int roleId);*/
	
	@Autowired
	private RoleMapper mapper;

	public void add(Role role){
		mapper.add(role);
	}
	
	public void remove(int roleId){
		mapper.remove(roleId);
	}
	
	public void edit(Role role){
		mapper.edit(role);
	}
	
	public List<Role> query(){
		return mapper.query();
	}
	
	public Role getRoleById(int roleId){
		return mapper.getRoleById(roleId);
	}
	
	public List<Role> listRole(){
		return mapper.listRole();
	}
	
}
