package com.paxcel.mail.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paxcel.mail.daoInterface.CustomerRepository;
import com.paxcel.mail.model.Customer;
import com.paxcel.mail.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.err.println("FN:- "+customer.getFirstName()+" LN:- "+customer.getLastName());
		repository.save(customer);
	}

	
}
