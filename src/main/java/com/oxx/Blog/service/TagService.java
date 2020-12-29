package com.oxx.Blog.service;

import java.util.List;

import com.oxx.Blog.pojo.Tag;

public interface TagService extends BaseService<Tag>{
	
	List<Tag> list(Tag tag);
}
