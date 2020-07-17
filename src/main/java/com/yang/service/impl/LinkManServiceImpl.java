package com.yang.service.impl;

import java.util.List;

import com.yang.dao.LinkManDao;
import com.yang.entity.LinkMan;
import com.yang.service.LinkManService;

public class LinkManServiceImpl implements LinkManService {
	private LinkManDao linkManDao;
	public void setLinkManDao(LinkManDao linkManDao) {
		this.linkManDao = linkManDao;
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
