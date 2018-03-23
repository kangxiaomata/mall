package com.model;

import java.sql.Date;

public class Order {
	
	private int order_id;
	private String order_code;
	private double order_price;
	private Date create_time;
	private int member_id;
	private int order_status;
	private int payment_status;
	private int shipping_status;
	private String payment_way;
	private Receive receive_id;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_code() {
		return order_code;
	}
	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}
	public double getOrder_price() {
		return order_price;
	}
	public void setOrder_price(double order_price) {
		this.order_price = order_price;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	public int getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(int payment_status) {
		this.payment_status = payment_status;
	}
	public int getShipping_status() {
		return shipping_status;
	}
	public void setShipping_status(int shipping_status) {
		this.shipping_status = shipping_status;
	}
	public String getPayment_way() {
		return payment_way;
	}
	public void setPayment_way(String payment_way) {
		this.payment_way = payment_way;
	}
	public Receive getReceive_id() {
		return receive_id;
	}
	public void setReceive_id(Receive receive_id) {
		this.receive_id = receive_id;
	}
	
}
