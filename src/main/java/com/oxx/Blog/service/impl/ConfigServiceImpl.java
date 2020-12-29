package com.oxx.Blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oxx.Blog.dao.ConfigMapper;
import com.oxx.Blog.pojo.Config;
import com.oxx.Blog.service.ConfigService;

@Service
@Transactional
public class ConfigServiceImpl extends BaseServiceImpl<Config,ConfigMapper> implements ConfigService{

	
	@Autowired
	private ConfigMapper configMapper;
	
	@Override
	public List<Config> findByConfigNames(String[] config_names) {
		// TODO Auto-generated method stub
		return configMapper.findByConfigNames(config_names);
	}

	@Override
	public Config findByConfigName(String config_name) {
		// TODO Auto-generated method stub
		return configMapper.findByConfigName(config_name);
	}

	@Override
	public List<Config> list() {
		// TODO Auto-generated method stub
		return configMapper.list();
	}

	@Override
	public int edit(Config config) {
		// TODO Auto-generated method stub
		return configMapper.edit(config);
	}

}
