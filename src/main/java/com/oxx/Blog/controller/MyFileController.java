package com.oxx.Blog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oxx.Blog.common.Result;
import com.oxx.Blog.util.GetFoldFileNames;

@RestController
@RequestMapping("/myfile")
public class MyFileController {

	@RequestMapping("/upload")
	public Result upload() {
		Result result=new Result();
		
		List<String> list=GetFoldFileNames.getFileName("E:\\tool\\Blog\\src\\main\\resources\\static\\images");
		
		result.setCode(Result.SUCCESS_CODE);
		result.setMessage("");
		result.setData(list);
		
		return result;
	}
}
