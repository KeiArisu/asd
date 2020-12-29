package com.oxx.Blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.oxx.Blog.dao.BaseDao;
import com.oxx.Blog.service.BaseService;

public class BaseServiceImpl<B,D extends BaseDao<B>> implements BaseService<B>{

	@Autowired
	private D d;
	
	public D getMapper() {
		return d;
	}
	
	@Override
	public List<B> findAll(int page, int pageSize, B b) {
		PageHelper.startPage(page,pageSize);
		return d.findAll(b);
	}

	@Override
	public B findById(Integer id) {
		// TODO Auto-generated method stub
		return d.findById(id);
	}

	@Override
	public int insert(B b) {
		// TODO Auto-generated method stub
		return d.insert(b);
	}

	@Override
	public int update(B b) {
		// TODO Auto-generated method stub
		return d.update(b);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return d.delete(id);
	}

	@Override
	public int deletes(int[] ids) {
		// TODO Auto-generated method stub
		return d.deletes(ids);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return d.count();
	}

	@Override
	public int up(int[] ids) {
		// TODO Auto-generated method stub
		return d.up(ids);
	}


}
