package com.bill.firstapplication.dao.impl;

import org.springframework.data.repository.CrudRepository;

import com.bill.firstapplication.modol.User;
import java.lang.String;
import java.util.List;

public interface UserDao extends CrudRepository<User, Integer>{
	
	List<User> findByAccount(String account);
}
