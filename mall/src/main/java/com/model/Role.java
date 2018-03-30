package com.model;

import java.util.List;

public class Role {

	/*	create table role(                             -- ��ɫ��
			 roleId int primary key auto_increment,        -- ��ɫid
			 roleName varchar(20) not null,                -- ��ɫ��
			 rolePs varchar(100) null                      -- ��ɫ��ע
			)auto_increment=1;*/

	private int roleId;
	private String roleName;
	private String rolePs;
	private List<Privilege> privileges;
	
	public int getRoleId() {
		return roleId;
	}
	
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRolePs() {
		return rolePs;
	}
	public void setRolePs(String rolePs) {
		this.rolePs = rolePs;
	}
	public List<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", rolePs=" + rolePs + ", privileges=" + privileges
				+ "]";
	}
	public Role() {
		super();
	}
	public Role(int roleId, String roleName, String rolePs, List<Privilege> privileges) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.rolePs = rolePs;
		this.privileges = privileges;
	}





}
