package com.oxx.Blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oxx.Blog.dao.CategoryMapper;
import com.oxx.Blog.pojo.Category;
import com.oxx.Blog.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category, CategoryMapper> implements CategoryService{

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> list(Category category) {
		// TODO Auto-generated method stub
		return categoryMapper.list(category);
	}

}
