package com.model;

public class Product {

	private int pid;
	private String pname;
	private double price;
	private int saleCount;
	private String descript;
	private Pbrand pbrand;
	private String pimg;
	private ProductType productType;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSaleCount() {
		return saleCount;
	}
	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public Pbrand getPbrand() {
		return pbrand;
	}
	public void setPbrand(Pbrand pbrand) {
		this.pbrand = pbrand;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", saleCount=" + saleCount
				+ ", descript=" + descript + ", pimg=" + pimg + ", productType=" + productType + "]";
	}
	
	
}
