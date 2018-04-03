package com.mapper;

import java.util.List;
import java.util.Map;
import com.model.Privilege;


public interface PrivilegeMapper {
	
	public void add(Privilege privilege);
	
	public void remove(int priId);
	
	public void edit(Privilege privilege);
	
	public List<Privilege> query(Map map);
	
	public Privilege getPrivilegeById(int priId);
	
	public List<Privilege> getPrivilegeByRoleId(int roleId);
	
}
