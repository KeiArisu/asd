package com.oxx.Blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxx.Blog.common.Result;
import com.oxx.Blog.pojo.Link;
import com.oxx.Blog.service.LinkService;

@RestController
@RequestMapping("/link")
public class LinkController extends BaseController<Link, LinkService>{
	
	@Autowired
	private LinkService linkService;
	
	@RequestMapping("/list")
	public Result list(Link link){
		
		List<Link> row = linkService.list(link);
		
		return new Result(Result.SUCCESS_CODE,"",row);
	}
}
