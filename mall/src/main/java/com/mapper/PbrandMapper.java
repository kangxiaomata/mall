package com.mapper;

import java.util.List;

import com.model.Pbrand;
public interface PbrandMapper {
	
	public void save(Pbrand pbrand);
	public void delete(int pbid);
	public void update(Pbrand pbrand);
	public Pbrand getById(int pbid);
	public List<Pbrand> listAll();

}
