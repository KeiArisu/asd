package com.oxx.Blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxx.Blog.common.Result;
import com.oxx.Blog.pojo.Category;
import com.oxx.Blog.service.CategoryService;
import com.oxx.Blog.util.GetFoldFileNames;

@RestController
@RequestMapping("/category")
public class CategoryController extends BaseController<Category,CategoryService>{
	
	@Autowired
	private CategoryService cate;
	
	@RequestMapping("/getImage")
	public Result getImage() {
		
		Result result=new Result();
		
		List<String> list=GetFoldFileNames.getFileName("E:\\tool\\Blog\\src\\main\\resources\\static\\images\\category");
		
		result.setCode(Result.SUCCESS_CODE);
		result.setMessage("");
		result.setData(list);
		
		return result;
		
	}
	
	@RequestMapping("/list")
	public Result list(Category category){
		
		List<Category> list=cate.list(category);
		
		return new Result(Result.ERROR_CODE,"",list);
		
	}
}
