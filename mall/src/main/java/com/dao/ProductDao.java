package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mapper.ProductMapper;
import com.model.Product;
import com.util.DbUtil;

public class ProductDao {

	public Product getById(int pid) {
		SqlSession session = DbUtil.getSession();
		ProductMapper pm = session.getMapper(ProductMapper.class);
		Product product = pm.getById(pid);
		DbUtil.close(session);
		return product;
	}
	
	public List<Product> listAll(Map map) {
		SqlSession session = DbUtil.getSession();
		ProductMapper pm = session.getMapper(ProductMapper.class);
		List<Product> products = pm.listAll(map);
		DbUtil.close(session);
		return products;
	}
	
	public int getTotalPage(Map map,int size) {
		SqlSession session = DbUtil.getSession();
		ProductMapper pm = session.getMapper(ProductMapper.class);
		int totalCount = pm.getTotalCount(map);
		int totalPage = totalCount%size==0?(totalCount/size):(totalCount/size+1);
		DbUtil.close(session);
		return totalPage;
	}
	
	public void save(Product product) {
		SqlSession session = DbUtil.getSession();
		ProductMapper pm = session.getMapper(ProductMapper.class);
		pm.save(product);
		DbUtil.close(session);
	}
	
	public void delete(int pid) {
		SqlSession session = DbUtil.getSession();
		ProductMapper pm = session.getMapper(ProductMapper.class);
		pm.delete(pid);
		DbUtil.close(session);
	}
	
	public void update(Product product) {
		SqlSession session = DbUtil.getSession();
		ProductMapper pm = session.getMapper(ProductMapper.class);
		pm.update(product);
		DbUtil.close(session);
	}
}
