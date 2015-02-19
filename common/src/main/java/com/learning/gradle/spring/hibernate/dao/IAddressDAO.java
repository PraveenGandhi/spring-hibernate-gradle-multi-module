package com.learning.gradle.spring.hibernate.dao;

import java.util.List;

import com.learning.gradle.spring.hibernate.entity.Address;

public interface IAddressDAO {

	public abstract void save(Address employee);
	public abstract List<Address> getAll();
	public abstract Address get(Long id);

}