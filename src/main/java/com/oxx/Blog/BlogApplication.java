package com.oxx.Blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oxx.Blog.dao") //扫描注册bin
public class BlogApplication{

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	
}
