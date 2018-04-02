package com.model;

public class User {

	
/*	create table user (                      -- 会员表
			user_id int PRIMARY KEY AUTO_INCREMENT,  -- ID
			user_username VARCHAR(20) not NULL,      -- 用户名 
			user_pwd  VARCHAR(20) not NULL,          -- 密码 
			user_nickName VARCHAR(20) not NULL,      -- 昵称 
			user_email VARCHAR(30) ,                 -- 电子邮箱
			user_birth date,                         -- 注册时间  
			user_phone VARCHAR(11),                  -- 电话号码
			user_sex VARCHAR(2),                     -- 性别
			user_image VARCHAR(30),                  -- 头像
			user_birthday date,                      -- 生日
			address_id INT                           -- 地址
			);*/
	
	private int user_id;
	private String user_username;
	private String user_pwd;
	private String user_nickName;
	private String user_emil;
	private String user_birth;
	private String user_phone;
	private String user_sex;
	private String user_image;
	private String user_birthday;
	private int address_id;
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_username() {
		return user_username;
	}
	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_nickName() {
		return user_nickName;
	}
	public void setUser_nickName(String user_nickName) {
		this.user_nickName = user_nickName;
	}
	public String getUser_emil() {
		return user_emil;
	}
	public void setUser_emil(String user_emil) {
		this.user_emil = user_emil;
	}
	public String getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_image() {
		return user_image;
	}
	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}
	public String getUser_birthday() {
		return user_birthday;
	}
	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_username=" + user_username + ", user_pwd=" + user_pwd
				+ ", user_nickName=" + user_nickName + ", user_emil=" + user_emil + ", user_birth=" + user_birth
				+ ", user_phone=" + user_phone + ", user_sex=" + user_sex + ", user_image=" + user_image
				+ ", user_birthday=" + user_birthday + ", address_id=" + address_id + "]";
	}
	public User(int user_id, String user_username, String user_pwd, String user_nickName, String user_emil,
			String user_birth, String user_phone, String user_sex, String user_image, String user_birthday,
			int address_id) {
		super();
		this.user_id = user_id;
		this.user_username = user_username;
		this.user_pwd = user_pwd;
		this.user_nickName = user_nickName;
		this.user_emil = user_emil;
		this.user_birth = user_birth;
		this.user_phone = user_phone;
		this.user_sex = user_sex;
		this.user_image = user_image;
		this.user_birthday = user_birthday;
		this.address_id = address_id;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
}
