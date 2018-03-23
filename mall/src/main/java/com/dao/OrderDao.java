package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mapper.OrderMapper;
import com.model.Order;
import com.util.DbUtil;
public class OrderDao {
	
	public List<Order> listOrder() {
		SqlSession session=DbUtil.getSession();
		OrderMapper orderMapper =session.getMapper(OrderMapper.class);
		List<Order> list=orderMapper.listOrder();
		return list;
	}

}
