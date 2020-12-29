package com.oxx.Blog.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.oxx.Blog.common.Result;
import com.oxx.Blog.service.BaseService;

public class BaseController<B, S extends BaseService<B>> {
	
	@Autowired
	private S s;
	/**
	 * 查询所有数据 
	 *@param b 封装条件的实体 
 	 *@return 集合
	 */	
	@RequestMapping("/findAll")
	public PageInfo<B> findAll(int page,@RequestParam(defaultValue = "10",name = "limit")int pageSize,B b){
		List<B> bs=s.findAll(page, pageSize, b);
		return new PageInfo<>(bs);
	}
	
	/**
	 * 根据id查询数据 
	 *@param id 主键 
 	 *@return 实体对象	
	 */	
	@RequestMapping("/findById")
	public B findById(@RequestParam(name="id")Integer id){
		System.out.println(id);
		B b = s.findById(id);
		System.out.println(b);
		return b;
	}
	
	/**
	 * 新增
	 *@param b 实体对象 
 	 *@return 受影响的行
	 */	
	@RequestMapping("/insert")
	public int insert(B b) {
		int row = s.insert(b);
		return row;
	}
	
	/**
	 * 更新
	 *@param b 实体对象
 	 *@return 受影响的行
	 */	
	@RequestMapping("/update")
	public int update(B b){
		System.out.println(12123123);
		int row = s.update(b);
		return row;
	}
	
	/**
	 * 删除 
	 *@param id 主键 
 	 *@return 受影响的行实体对象	
	 */	
	@RequestMapping("/delete")
	public int delete(int id){
		int row = s.delete(id);
		return row;
	}
	/**
	 * 批量删除
	 *@param ids 多个主键【数组】
 	 *@return 受影响的行
	 */	
	@RequestMapping("/deletes")
	public int deletes(@RequestParam(name="ids[]")int[] ids){
		int row = s.deletes(ids);
		return row;
	}
	
	@RequestMapping("/count")
	public Result count() {
		int row = s.count();
		
		Result result = new Result(Result.SUCCESS_CODE,"",row);
		
		return result;
	}
	@RequestMapping("/updatei")
	public Result up(@RequestParam(name = "ids[]") int ids[]) {
		int row = s.up(ids);

		Result result=new Result(Result.SUCCESS_CODE, "", row);
		
		return result;
	}
}
