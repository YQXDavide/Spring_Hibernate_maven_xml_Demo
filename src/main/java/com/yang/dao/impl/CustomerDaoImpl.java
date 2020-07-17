package com.yang.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yang.dao.CustomerDao;
import com.yang.entity.Customer;
import com.yang.utils.HibernateUtil;

public class CustomerDaoImpl implements CustomerDao {
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	@Override
	public Customer selectOne(int id) {
		
		
		return null;
	}

	@Override
	public List<Customer> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCust() {
		Customer cust = new Customer();
		cust.setCustName("孙悟空");
		cust.setCustAddress("花果山");
		cust.setCustLevel("级别2");
		cust.setCustPhone("15235373883");
		session.save(cust);
	}

	@Override
	public void updateCust() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletCust() {
		// TODO Auto-generated method stub

	}

}
