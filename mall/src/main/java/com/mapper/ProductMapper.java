package com.mapper;

import java.util.List;
import java.util.Map;

import com.model.Product;

public interface ProductMapper {

	public void save(Product product);
	public void delete(int pid);
	public void update(Product product);
	public Product getById(int pid);
	public List<Product> listAll(Map map);
	public int getTotalCount(Map map);
	
}
