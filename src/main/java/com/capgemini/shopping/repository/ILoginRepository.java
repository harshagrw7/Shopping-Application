package com.capgemini.shopping.repository;

import com.capgemini.shopping.entity.User;

public interface ILoginRepository {
	
	User addUser(User user);
	User removeUser(User user);
	User validateUser(User user);
	User signOut(User user);
	

}
