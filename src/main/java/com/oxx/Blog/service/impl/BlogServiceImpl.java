package com.oxx.Blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.oxx.Blog.dao.BlogMapper;
import com.oxx.Blog.pojo.Blog;
import com.oxx.Blog.service.BlogService;

@Service
@Transactional
public class BlogServiceImpl extends BaseServiceImpl<Blog, BlogMapper> implements BlogService{
	@Autowired
	private BlogMapper blogMapper;
	
	@Override
	public List<Blog> getBlogCountGroup() {
		// TODO Auto-generated method stub
		return blogMapper.getBlogCountGroup();
	}

	@Override
	public List<Blog> dim(Blog blog) {
		// TODO Auto-generated method stub
		return blogMapper.dim(blog);
	}

	@Override
	public List<Blog> findAllByDate() {
		// TODO Auto-generated method stub
		return blogMapper.findAllByDate();
	}

	@Override
	public List<Blog> list(Blog blog) {
		// TODO Auto-generated method stub
		return blogMapper.list(blog);
	}

	@Override
	public List<Blog> comment(Blog blog) {
		// TODO Auto-generated method stub
		return blogMapper.comment(blog);
	}

	@Override
	public List<Blog> findByIds(Blog blog) {
		// TODO Auto-generated method stub
		return blogMapper.findByIds(blog);
	}

	@Override
	public int edit_blog_views(Blog blog) {
		// TODO Auto-generated method stub
		return blogMapper.edit_blog_views(blog);
	}

	@Override
	public int countByStatus() {
		// TODO Auto-generated method stub
		return blogMapper.countByStatus();
	}

	@Override
	public List<Blog> lists(int page, int pageSize, Blog blog) {
		//设置分页参数
		PageHelper.startPage(page, pageSize);
		//排序
		PageHelper.orderBy("blog_id desc");
		return blogMapper.list(blog);
	}
}
