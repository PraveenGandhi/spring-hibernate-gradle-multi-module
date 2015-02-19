package com.learning.gradle.spring.hibernate.service;

import java.util.List;

import com.learning.gradle.spring.hibernate.entity.Address;

public interface IAddressService {

	public abstract void save(Address employee);

	public abstract List<Address> getAll();

	public abstract Address get(Long id);

}