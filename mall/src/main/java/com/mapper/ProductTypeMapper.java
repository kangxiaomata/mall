package com.mapper;

import java.util.List;

import com.model.ProductType;

public interface ProductTypeMapper {

	public void save(ProductType productType);
	public void delete(int ptid);
	public void update(ProductType productType);
	public ProductType getById(int ptid);
	public List<ProductType> listAll();
	
}
