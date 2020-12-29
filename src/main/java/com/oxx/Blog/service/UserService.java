package com.oxx.Blog.service;


import java.util.List;

import com.oxx.Blog.pojo.User;
public interface UserService extends BaseService<User> {
	
	User login(User user);
	
	User findUserById(int admin_user_id);
	
	List<User> list(User user);
	
	int edit(User user);
	
	int edits(User user);
}
