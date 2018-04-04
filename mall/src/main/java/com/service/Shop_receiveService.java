package com.service;

import java.util.List;
import java.util.Map;

import com.model.Shop_receive;

public interface Shop_receiveService {

	public void save(Shop_receive receive);
	public void update(Shop_receive receive);
	public List<Shop_receive> listAll(Map map);
	public void delete(int receive_id);
	public Shop_receive getById(int receive_id);
}
