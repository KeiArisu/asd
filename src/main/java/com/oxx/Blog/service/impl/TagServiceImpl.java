package com.oxx.Blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oxx.Blog.dao.TagMapper;
import com.oxx.Blog.pojo.Tag;
import com.oxx.Blog.service.TagService;

@Service
@Transactional
public class TagServiceImpl extends BaseServiceImpl<Tag, TagMapper> implements TagService{
	@Autowired
	private TagMapper tagMapper;
	
	@Override
	public List<Tag> list(Tag tag) {
		// TODO Auto-generated method stub
		return tagMapper.list(tag);
	}
}
