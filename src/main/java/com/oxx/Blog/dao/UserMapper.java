package com.oxx.Blog.dao;

import java.util.List;

import com.oxx.Blog.pojo.User;

public interface UserMapper extends BaseDao<User>{
	
	User findUserByUsernameAndPassword(User user);
	
	User findUserById(int admin_user_id);
	
	List<User> list(User user);
	
	int edit(User user);
	
	int edits(User user);
}
