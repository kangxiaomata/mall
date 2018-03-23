package com.model;

public class ProductType {

	private int ptid;
	private String ptname;
	private int producttypeid;
	public int getPtid() {
		return ptid;
	}
	public int getProducttypeid() {
		return producttypeid;
	}
	public void setProducttypeid(int producttypeid) {
		this.producttypeid = producttypeid;
	}
	public void setPtid(int ptid) {
		this.ptid = ptid;
	}
	public String getPtname() {
		return ptname;
	}
	public void setPtname(String ptname) {
		this.ptname = ptname;
	}
	
}
