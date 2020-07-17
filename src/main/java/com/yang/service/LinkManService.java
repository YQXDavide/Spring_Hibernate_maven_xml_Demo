package com.yang.service;

import java.util.List;

import com.yang.entity.LinkMan;

public interface LinkManService {
	LinkMan selectOne(int id);
	
	List<LinkMan> selectAll();
	
	void savelkm();
	
	void updatelkm();
	
	void deletlkm();
}
