package com.yang.dao;

import java.util.List;

import com.yang.entity.LinkMan;


public interface LinkManDao {
	
	LinkMan selectOne(int id);
	
	List<LinkMan> selectAll();
	
	void savelkm();
	
	void updatelkm();
	
	void deletlkm();
}
