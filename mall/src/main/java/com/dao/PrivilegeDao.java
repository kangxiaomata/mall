package com.dao;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mapper.PrivilegeMapper;
import com.model.Privilege;

@Repository
public class PrivilegeDao {

/*	public void add(Privilege privilege);
	
	public void remove(int priId);
	
	public void edit(Privilege privilege);
	
	public List<Privilege> query();
	
	public Privilege getPrivilegeById(int priId);
	
	public List<Privilege> getPrivilegeByRoleId(int roleId);*/
	
	@Autowired
	private PrivilegeMapper mapper;
	
	public void add(Privilege privilege){
		mapper.add(privilege);
	}
	
	public void remove(int priId){
		mapper.remove(priId);
	}
	
	public void edit(Privilege privilege){
		mapper.edit(privilege);
	}
	
	public List<Privilege> query(Map map){
		return mapper.query(map);
	}
	
	public Privilege getPrivilegeById(int priId){
		return mapper.getPrivilegeById(priId);
	}
	
	public List<Privilege> getPrivilegeByRoleId(int roleId){
		return mapper.getPrivilegeByRoleId(roleId);
	}
	
}
