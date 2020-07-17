package com.yang.dao;

import java.util.List;

import com.yang.entity.Customer;

public interface CustomerDao {
	Customer selectOne(int id);
	
	List<Customer> selectAll();
	
	void saveCust();
	
	void updateCust();
	
	void deletCust();
}
