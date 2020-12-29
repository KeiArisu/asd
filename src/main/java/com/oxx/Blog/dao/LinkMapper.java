package com.oxx.Blog.dao;

import java.util.List;

import com.oxx.Blog.pojo.Link;

public interface LinkMapper extends BaseDao<Link>{
	List<Link> list(Link link);
}
