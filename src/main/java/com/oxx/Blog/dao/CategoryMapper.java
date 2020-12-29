package com.oxx.Blog.dao;

import java.util.List;

import com.oxx.Blog.pojo.Category;

public interface CategoryMapper extends BaseDao<Category>{
	List<Category> list(Category category);
}
