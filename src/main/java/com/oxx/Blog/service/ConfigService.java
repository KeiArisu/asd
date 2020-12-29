package com.oxx.Blog.service;

import java.util.List;

import com.oxx.Blog.pojo.Config;

public interface ConfigService extends BaseService<Config>{
	
	List<Config> list();

	Config findByConfigName(String config_name);

	int edit(Config config);

	List<Config> findByConfigNames(String[] config_names);
}
