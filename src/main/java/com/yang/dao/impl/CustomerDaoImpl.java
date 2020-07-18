package com.yang.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.yang.dao.CustomerDao;
import com.yang.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
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
		cust.setCustName("猪八戒");
		cust.setCustAddress("高老庄");
		cust.setCustLevel("级别2");
		cust.setCustPhone("15235373884");
		hibernateTemplate.save(cust);
		
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
