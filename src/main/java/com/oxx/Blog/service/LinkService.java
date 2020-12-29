package com.oxx.Blog.service;

import java.util.List;

import com.oxx.Blog.pojo.Link;

public interface LinkService extends BaseService<Link>{
	List<Link> list(Link link);
}
