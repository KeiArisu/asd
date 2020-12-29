package com.oxx.Blog.service;

import java.util.List;

import com.oxx.Blog.pojo.Comment;


public interface BaseService<B> {
	
	/**
	 * 查询所有数据 
	 *@param b 封装条件的实体 
 	 *@return 集合
	 */	
	List<B> findAll(int page,int pageSize,B b);
	
	/**
	 * 根据id查询数据 
	 *@param id 主键 
 	 *@return 实体对象	
	 */	
	B findById(Integer  id);
	
	/**
	 * 新增
	 *@param b 实体对象 
 	 *@return 受影响的行
	 */	
	int insert(B b);
	
	/**
	 * 更新
	 *@param b 实体对象
 	 *@return 受影响的行
	 */	
	int update(B b);
	
	/**
	 * 删除 
	 *@param id 主键 
 	 *@return 受影响的行实体对象	
	 */	
	int delete(int id);
	
	/**
	 * 批量删除
	 *@param ids 多个主键【数组】
 	 *@return 受影响的行
	 */	
	int deletes(int[] ids);
	
	
	int count();
	
	int up(int ids[]);
}
