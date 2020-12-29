package com.oxx.Blog.service;

import java.util.List;

import com.oxx.Blog.pojo.Category;

public interface CategoryService extends BaseService<Category>{
	List<Category> list(Category category);
}
