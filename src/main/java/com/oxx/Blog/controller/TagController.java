package com.oxx.Blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxx.Blog.common.Result;
import com.oxx.Blog.pojo.Tag;
import com.oxx.Blog.service.TagService;

@RestController
@RequestMapping("/tag")
public class TagController extends BaseController<Tag, TagService>{
	@Autowired
	private TagService tagService;
	
	@RequestMapping("/list")
	public Result list(Tag tag){
		
		List<Tag> list=tagService.list(tag);
		
		return new Result(Result.ERROR_CODE,"",list);
		
	}
}
