package com.learning.gradle.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learning.gradle.spring.hibernate.dao.IAddressDAO;
import com.learning.gradle.spring.hibernate.entity.Address;

@Service
@Transactional
public class AddressService implements IAddressService {

	@Autowired
	private IAddressDAO addressDAO;

	public void save(Address address) {
		addressDAO.save(address);
	}

	public List<Address> getAll() {
		return addressDAO.getAll();
	}

	public Address get(Long id) {
		return addressDAO.get(id);
	}
}
