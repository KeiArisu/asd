package com.oxx.Blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.oxx.Blog.common.Result;
import com.oxx.Blog.pojo.Blog;
import com.oxx.Blog.pojo.Comment;
import com.oxx.Blog.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController extends BaseController<Comment,CommentService>{
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/plsh")
	public Result audit(@RequestParam(name = "ids[]") int ids[]) {
		int row = commentService.audit(ids);

		Result result=new Result(Result.SUCCESS_CODE, "", row);
		
		return result;
	}
	
	@RequestMapping("/list_comment")
	public Result list_comment(Comment comment) {
		
		List<Comment> list = commentService.list_comment(comment);

		return new Result(Result.SUCCESS_CODE, "", list);
		
	}
	
	@RequestMapping("/edit")
	public Result edit(Comment comment) {
		int row = commentService.edit(comment);
		
		return new Result(Result.SUCCESS_CODE, "", row);
	}
	
	@RequestMapping("/findByBlogId")
	public PageInfo<Blog> findByBlogId(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize, Integer blog_id) {
		System.out.println(blog_id);
		List<Blog> list = commentService.findByBlogId(page,pageSize,blog_id);

		PageInfo<Blog> info = new PageInfo<>(list);

		return info;
	}
	
	@RequestMapping("/countByBlogId")
	public Result countByBlogId(int blog_id) {
		
		int count=commentService.countByBlogId(blog_id);
		
		Result result=new Result(Result.SUCCESS_CODE, "", count);
		
		return result;
	}
}
