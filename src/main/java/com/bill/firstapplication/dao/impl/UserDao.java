package com.bill.firstapplication.dao.impl;

import org.springframework.data.repository.CrudRepository;

import com.bill.firstapplication.modol.User;

public interface UserDao extends CrudRepository<User, Integer>{

}
