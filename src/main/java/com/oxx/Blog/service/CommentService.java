package com.oxx.Blog.service;
import java.util.List;

import com.oxx.Blog.pojo.Blog;
import com.oxx.Blog.pojo.Comment;

public interface CommentService extends BaseService<Comment>{
	
	int audit(int ids[]);
	
	List<Comment> list_comment(Comment comment);
	
	int edit(Comment comment);
	
	int countByBlogId(int blog_id);

	List<Blog> findByBlogId(int page, int pageSize, Integer asd);
}
