package com.yang.service.impl;

import java.util.List;

import com.yang.dao.CustomerDao;
import com.yang.entity.Customer;
import com.yang.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public Customer selectOne(int id) {
		return customerDao.selectOne(id);
	}

	@Override
	public List<Customer> selectAll() {
		return customerDao.selectAll();
	}

	@Override
	public void saveCust() {
		customerDao.saveCust();

	}

	@Override
	public void updateCust() {
		customerDao.updateCust();

	}

	@Override
	public void deletCust() {
		customerDao.deletCust();

	}

}
