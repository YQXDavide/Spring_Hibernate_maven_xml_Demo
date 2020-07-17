package com.yang.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yang.dao.CustomerDao;
import com.yang.entity.Customer;
import com.yang.utils.HibernateUtil;

public class CustomerDaoImpl implements CustomerDao {
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
		Session session = HibernateUtil.getCurrentSession();
		Transaction tx = session.beginTransaction();
		Customer cust = new Customer();
		cust.setCustName("唐僧");
		cust.setCustAddress("大唐");
		cust.setCustLevel("级别1");
		cust.setCustPhone("15235373881");
		session.save(cust);
		tx.commit();
		session.close();
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
