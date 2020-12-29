package com.oxx.Blog.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oxx.Blog.common.Result;
import com.oxx.Blog.pojo.Config;
import com.oxx.Blog.service.ConfigService;

@RestController
@RequestMapping("/config")
public class ConfigController extends BaseController<Config, ConfigService>{
	@Autowired
	private ConfigService configService;
	
	@RequestMapping("/list")
	public Result list() {
		
		List<Config> list=configService.list();
		
		Result result=new Result(Result.SUCCESS_CODE, "", list);
		
		return result;
	}
	
	@RequestMapping("/findByConfigName")
	public Result findByConfigName(String config_name) {
		
		Config config=configService.findByConfigName(config_name);
		
		Result result=new Result(Result.SUCCESS_CODE, "", config);
		
		return result;
	}
	
	@RequestMapping("findByConfigNames")
	public Result findByConfigNames(@RequestParam(name = "config_names[]")String[] config_names) {
		
		List<Config> list=configService.findByConfigNames(config_names);
		
		Result result=new Result(Result.SUCCESS_CODE,"",list);
		
		return result;
	}
	
	@RequestMapping("/edit")
	public Result edit(Config config) {
		
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String update_time=format.format(date);
		config.setUpdate_time(update_time);
		
		int row=configService.edit(config);
		
		Result result=new Result(Result.SUCCESS_CODE, "", row);
		
		return result;
	}
}
