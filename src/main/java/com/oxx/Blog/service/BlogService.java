package com.oxx.Blog.service;

import java.util.List;

import com.oxx.Blog.pojo.Blog;

public interface BlogService extends BaseService<Blog> {
	List<Blog> getBlogCountGroup();
	
	List<Blog> dim(Blog blog);
	
	List<Blog> findAllByDate();
	
	List<Blog> list(Blog blog);
	
	List<Blog> comment(Blog blog);
	
	List<Blog> findByIds(Blog blog);
	
	int edit_blog_views(Blog blog);
	
	int countByStatus();
	
	List<Blog> lists(int page, int pageSize, Blog blog);
}
