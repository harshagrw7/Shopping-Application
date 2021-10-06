package com.capgemini.shopping.repository;

import com.capgemini.shopping.entity.Address;

public interface IAddressRepository {
	public Address addAddress(Address add);
	public Address updateAddress(Address add);
	public Address removeAddress(Address add);
	public Address viewAllAddress(Address add);
	public Address viewAddress(Address add);
	
	

}
