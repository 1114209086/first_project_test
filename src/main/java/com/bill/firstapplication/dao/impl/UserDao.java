package com.bill.firstapplication.dao.impl;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bill.firstapplication.modol.User;
import java.lang.String;
import java.util.List;

public interface UserDao extends CrudRepository<User, Integer>{
	
	List<User> findByAccount(String account);
	
	@Query("select u from User u where u.address=:address and u.phoneNumber=:phoneNumber")
	List<User> findByAddressAndPhoneNumber(@Param("address") String address,@Param("phoneNumber") String phoneNumber);
}
