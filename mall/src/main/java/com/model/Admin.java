package com.model;

public class Admin {

/*	
 * create table admin (                           -- �û���
			  aid int PRIMARY key auto_increment,          -- �û�����
			  username varchar(15) not null UNIQUE,        -- �û���
			  password varchar(15) not null ,              -- ����
			  realName varchar(20) not null,               -- ��ʵ����
			  roleId int not null                          -- ��ɫId
			)auto_increment=1;*/
	
	
	private int aid ;
	private String username;
	private String password;
	private String realName;
    private Role role;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", username=" + username + ", password=" + password + ", realName=" + realName
				+ ", role=" + role + "]";
	}
	public Admin(int aid, String username, String password, String realName, Role role) {
		super();
		this.aid = aid;
		this.username = username;
		this.password = password;
		this.realName = realName;
		this.role = role;
	}
    
    public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
