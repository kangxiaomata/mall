package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.Shop_receiveMapper;
import com.model.Shop_receive;

@Service
public class Shop_receiveServiceImpl implements Shop_receiveService {
	
	@Autowired
	private Shop_receiveMapper shop_receiveMapper;
	
	@Override
	public void save(Shop_receive receive) {
		if (receive!=null) {
			shop_receiveMapper.save(receive);
		}
	}

	@Override
	public void update(Shop_receive receive) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Shop_receive> listAll(Map map) {
		List<Shop_receive> shop_receives = shop_receiveMapper.listAll(map);
		return shop_receives;
	}

	@Override
	public void delete(int receive_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Shop_receive> getById(int member_id) {
	List<Shop_receive> shop_receives = shop_receiveMapper.getById(member_id);
		return shop_receives;
	}
}
