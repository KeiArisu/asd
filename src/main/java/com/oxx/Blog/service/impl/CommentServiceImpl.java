package com.oxx.Blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.oxx.Blog.dao.CommentMapper;
import com.oxx.Blog.pojo.Blog;
import com.oxx.Blog.pojo.Comment;
import com.oxx.Blog.service.CommentService;

@Service
@Transactional
public class CommentServiceImpl extends BaseServiceImpl<Comment, CommentMapper> implements CommentService{

	@Autowired
	private CommentMapper comment;
	
	@Override
	public int audit(int[] ids) {
		// TODO Auto-generated method stub
		return comment.audit(ids);
	}

	@Override
	public List<Comment> list_comment(Comment comment) {
		// TODO Auto-generated method stub
		return this.comment.list_comment(comment);
	}

	@Override
	public int edit(Comment comment) {
		// TODO Auto-generated method stub
		return this.comment.edit(comment);
	}

	@Override
	public int countByBlogId(int blog_id) {
		// TODO Auto-generated method stub
		return comment.countByBlogId(blog_id);
	}

	@Override
	public List<Blog> findByBlogId(int page, int pageSize, Integer asd) {
		
		PageHelper.startPage(page, pageSize);
		
		return comment.findByBlogId(asd);
	}
	

	
}
