package com.oxx.Blog.pojo;

public class Blog {
	
	//博客表主键id
	private int  blog_id;
	//博客表标题
	private String blog_title;
	//博客自定义路径url
	private String blog_sub_url;
	//博客封面图
	private String blog_cover_image;
	//博客内容
	private String blog_content;
	//博客分类id
	private int blog_category_id;
	//博客分类(冗余字段)
	private String blog_category_name;
	//博客标签
	private String blog_tags;
	//0-草稿 1-发布
	private Byte  blog_status;
	//阅读量
	private Long  blog_views;
	//0-允许评论 1-不允许评论
	private Byte  enable_comment;
	//是否删除 0=否 1=是
	private Byte  is_deleted;
	//添加时间
	 private String create_time;
	//修改时间
	 private String update_time;
	
	
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Blog(int blog_id, String blog_title, String blog_sub_url, String blog_cover_image, String blog_content,
			int blog_category_id, String blog_category_name, String blog_tags, Byte blog_status, Long blog_views,
			Byte enable_comment, Byte is_deleted, String create_time, String update_time) {
		super();
		this.blog_id = blog_id;
		this.blog_title = blog_title;
		this.blog_sub_url = blog_sub_url;
		this.blog_cover_image = blog_cover_image;
		this.blog_content = blog_content;
		this.blog_category_id = blog_category_id;
		this.blog_category_name = blog_category_name;
		this.blog_tags = blog_tags;
		this.blog_status = blog_status;
		this.blog_views = blog_views;
		this.enable_comment = enable_comment;
		this.is_deleted = is_deleted;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public int getBlog_id() {
		return blog_id;
	}

	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}

	public String getBlog_title() {
		return blog_title;
	}

	public void setBlog_title(String blog_title) {
		this.blog_title = blog_title;
	}

	public String getBlog_sub_url() {
		return blog_sub_url;
	}

	public void setBlog_sub_url(String blog_sub_url) {
		this.blog_sub_url = blog_sub_url;
	}

	public String getBlog_cover_image() {
		return blog_cover_image;
	}

	public void setBlog_cover_image(String blog_cover_image) {
		this.blog_cover_image = blog_cover_image;
	}

	public String getBlog_content() {
		return blog_content;
	}

	public void setBlog_content(String blog_content) {
		this.blog_content = blog_content;
	}

	public int getBlog_category_id() {
		return blog_category_id;
	}

	public void setBlog_category_id(int blog_category_id) {
		this.blog_category_id = blog_category_id;
	}

	public String getBlog_category_name() {
		return blog_category_name;
	}

	public void setBlog_category_name(String blog_category_name) {
		this.blog_category_name = blog_category_name;
	}

	public String getBlog_tags() {
		return blog_tags;
	}

	public void setBlog_tags(String blog_tags) {
		this.blog_tags = blog_tags;
	}

	public Byte getBlog_status() {
		return blog_status;
	}

	public void setBlog_status(Byte blog_status) {
		this.blog_status = blog_status;
	}

	public Long getBlog_views() {
		return blog_views;
	}

	public void setBlog_views(Long blog_views) {
		this.blog_views = blog_views;
	}

	public Byte getEnable_comment() {
		return enable_comment;
	}

	public void setEnable_comment(Byte enable_comment) {
		this.enable_comment = enable_comment;
	}

	public Byte getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(Byte is_deleted) {
		this.is_deleted = is_deleted;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpLocalDateTime_time() {
		return update_time;
	}

	public void setUpLocalDateTime_time(String update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "Blog [blog_id=" + blog_id + ", blog_title=" + blog_title + ", blog_sub_url=" + blog_sub_url
				+ ", blog_cover_image=" + blog_cover_image + ", blog_content=" + blog_content + ", blog_category_id="
				+ blog_category_id + ", blog_category_name=" + blog_category_name + ", blog_tags=" + blog_tags
				+ ", blog_status=" + blog_status + ", blog_views=" + blog_views + ", enable_comment=" + enable_comment
				+ ", is_deleted=" + is_deleted + ", create_time=" + create_time + ", upLocalDateTime_time=" + update_time + "]";
	}
	
	
}
