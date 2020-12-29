package com.oxx.Blog.dao;

import java.util.List;

import com.oxx.Blog.pojo.Tag;

public interface TagMapper extends BaseDao<Tag>{
	List<Tag> list(Tag tag);
}
