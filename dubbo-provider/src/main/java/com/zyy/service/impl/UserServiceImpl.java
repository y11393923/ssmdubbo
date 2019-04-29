package com.zyy.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zyy.entity.User;
import com.zyy.service.UserService;


public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAll() {
		List<User> list=new ArrayList<User>();
		list.add(new User(1,"zhangsan"));
		list.add(new User(2,"list"));
		return list;
	}

}
