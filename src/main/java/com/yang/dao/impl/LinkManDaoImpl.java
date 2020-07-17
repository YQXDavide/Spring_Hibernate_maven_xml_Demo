package com.yang.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.yang.dao.LinkManDao;
import com.yang.entity.LinkMan;

public class LinkManDaoImpl implements LinkManDao {
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	@Override
	public LinkMan selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LinkMan> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savelkm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatelkm() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletlkm() {
		// TODO Auto-generated method stub

	}

}
