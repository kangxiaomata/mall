package com.dao;



import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mapper.PbrandMapper;
import com.model.Pbrand;
import com.util.DbUtil;

public class PbrandDao {
	
	public Pbrand getById(int pbid) {
		SqlSession session = DbUtil.getSession();
		PbrandMapper pbm = session.getMapper(PbrandMapper.class);
		Pbrand pbrand = pbm.getById(pbid);
		DbUtil.close(session);
		return pbrand;
	}
	
	public List<Pbrand> listAll() {
		SqlSession session = DbUtil.getSession();
		PbrandMapper pbm = session.getMapper(PbrandMapper.class);
		List<Pbrand> pbrands = pbm.listAll();
		return null;
	}

}
