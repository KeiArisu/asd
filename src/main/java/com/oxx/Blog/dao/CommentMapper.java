package com.oxx.Blog.dao;

import java.util.List;

import com.oxx.Blog.pojo.Blog;
import com.oxx.Blog.pojo.Comment;

public interface CommentMapper extends BaseDao<Comment>{
	
	int audit(int ids[]);
	
	List<Comment> list_comment(Comment comment);
	
	int edit(Comment comment);
	
	int countByBlogId(int blog_id);

	List<Blog> findByBlogId(Integer ad);
}
