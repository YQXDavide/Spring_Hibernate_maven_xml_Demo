package com.yang.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.yang.dao.LinkManDao;
import com.yang.entity.LinkMan;

public class LinkManDaoImpl implements LinkManDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
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
