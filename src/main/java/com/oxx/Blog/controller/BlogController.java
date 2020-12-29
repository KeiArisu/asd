package com.oxx.Blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.oxx.Blog.common.Result;
import com.oxx.Blog.pojo.Blog;
import com.oxx.Blog.service.BlogService;

@RestController
@RequestMapping("/blog")
public class BlogController extends BaseController<Blog,BlogService>{
	
	@Autowired
	private BlogService blogService;
	
	
	@RequestMapping("/lists")
	public PageInfo<Blog> list(@RequestParam(defaultValue = "1", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "limit") int pageSize, Blog blog) {
		System.out.println(page+"asdasd"+pageSize);
		List<Blog> list = blogService.lists(page,pageSize,blog);

		PageInfo<Blog> info = new PageInfo<>(list);

		return info;
	}
	
	
	@RequestMapping("/getBlogCountGroup")
	public Result getBlogCountGroup() {
		
		Result result=new Result();
		
		List<Blog> blogs=blogService.getBlogCountGroup();
		
		result.setCode(Result.SUCCESS_CODE);
		result.setMessage("");
		result.setData(blogs);
		
		return result;	
	}
	
	@RequestMapping("/dim")
	public Result dim(Blog blog) {
		
		List<Blog> row = blogService.dim(blog);
		
		return new Result(Result.SUCCESS_CODE,"",row);
		
	}
	
	@RequestMapping("/findAllByDate")
	public Result findAllByDate() {
		
		List<Blog> row = blogService.findAllByDate();
		
		return new Result(Result.SUCCESS_CODE,"",row);
	}
	
	@RequestMapping("/list")
	public Result list(Blog blog) {
		List<Blog> row = blogService.list(blog);
		
		return new Result(Result.SUCCESS_CODE,"",row);
	}
	
	@RequestMapping("/comment")
	public Result comment(Blog blog) {
		List<Blog> row = blogService.comment(blog);
		
		return new Result(Result.SUCCESS_CODE,"",row);
	}
	
	@RequestMapping("/findByIds")
	public Result findById(Blog blog) {
		
		List<Blog> list = blogService.findByIds(blog);
		
		blog.setBlog_views(list.get(0).getBlog_views()+1);
		
		blogService.edit_blog_views(blog);
		
		List<Blog> list1 = blogService.findByIds(blog);
		
		return new Result(Result.SUCCESS_CODE, "", list1);
		
	}
	
	@RequestMapping("countByStatus")
	public int countByStatus() {
		return blogService.countByStatus();
	}
}
