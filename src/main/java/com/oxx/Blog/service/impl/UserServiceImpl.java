package com.oxx.Blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oxx.Blog.dao.UserMapper;
import com.oxx.Blog.pojo.User;
import com.oxx.Blog.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, UserMapper> implements UserService{
	
	@Autowired
	private UserMapper u;
	
	@Override
	public User login(User user) {
		return u.findUserByUsernameAndPassword(user);
	}

	@Override
	public User findUserById(int admin_user_id) {
		// TODO Auto-generated method stub
		return u.findUserById(admin_user_id);
	}

	@Override
	public List<User> list(User user) {
		// TODO Auto-generated method stub
		return u.list(user);
	}

	@Override
	public int edit(User user) {
		// TODO Auto-generated method stub
		return u.edit(user);
	}

	@Override
	public int edits(User user) {
		// TODO Auto-generated method stub
		return u.edits(user);
	}

		
}
