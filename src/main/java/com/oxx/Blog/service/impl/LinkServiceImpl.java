package com.oxx.Blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oxx.Blog.dao.LinkMapper;
import com.oxx.Blog.pojo.Link;
import com.oxx.Blog.service.LinkService;

@Service
@Transactional
public class LinkServiceImpl extends BaseServiceImpl<Link,LinkMapper> implements LinkService{

	@Autowired
	private LinkMapper linkmapper;
	
	@Override
	public List<Link> list(Link link) {
		// TODO Auto-generated method stub
		return linkmapper.list(link);
	}

	

}
