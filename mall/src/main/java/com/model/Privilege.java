package com.model;

import java.util.List;

public class Privilege {

/*	create table privilege (                                -- 权限表
			  priId int primary key auto_increment,        -- 权限id
			  priName varchar (20) not null,               -- 权限名
			  parentId int not null,                       -- 父Id
			  priType int not null,                        -- 权限类型  0为功能/1为菜单
			  priNode int not null,                        -- 是否有子节点 0为没有/1为有
			  url varchar(50) not null,                    -- 权限连接
			  priPS varchar(100) null                      -- 权限备注
			  private List<Privilege> nodes;
			)auto_increment=1;*/
	
	private int priId;
	private String priName;
	private int parentId;
	private int priType;
	private int priNode;
	private String url;
	private String priAlias;
	public String getPriAlias() {
		return priAlias;
	}
	public void setPriAlias(String priAlias) {
		this.priAlias = priAlias;
	}
	private String priPs;
	private List<Privilege> nodes;
	
	
	public List<Privilege> getNodes() {
		return nodes;
	}
	public void setNodes(List<Privilege> nodes) {
		this.nodes = nodes;
	}
	public int getPriId() {
		return priId;
	}
	public void setPriId(int priId) {
		this.priId = priId;
	}
	public String getPriName() {
		return priName;
	}
	public void setPriName(String priName) {
		this.priName = priName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getPriType() {
		return priType;
	}
	public void setPriType(int priType) {
		this.priType = priType;
	}
	public int getPriNode() {
		return priNode;
	}
	public void setPriNode(int priNode) {
		this.priNode = priNode;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPriPs() {
		return priPs;
	}
	public void setPriPs(String priPs) {
		this.priPs = priPs;
	}
	
	public Privilege() {
		super();
	}
	
	

	public Privilege(int priId, String priName, int parentId, int priType, int priNode, String url, String priAlias,
			String priPs, List<Privilege> nodes) {
		super();
		this.priId = priId;
		this.priName = priName;
		this.parentId = parentId;
		this.priType = priType;
		this.priNode = priNode;
		this.url = url;
		this.priAlias = priAlias;
		this.priPs = priPs;
		this.nodes = nodes;
	}
	
	
	@Override
	public String toString() {
		return "Privilege [priId=" + priId + ", priName=" + priName + ", parentId=" + parentId + ", priType=" + priType
				+ ", priNode=" + priNode + ", url=" + url + ", priAlias=" + priAlias + ", priPs=" + priPs + ", nodes="
				+ nodes + "]";
	}

	
}
