package com.oxx.Blog.pojo;

public class Link {
	
	private int link_id;
	
	private int link_type;
	
	private String link_name;
	
	private String link_url;
	
	private String link_description;
	
	private int link_rank;
	
	private Byte is_deleted;
	
	private String create_time;

	public Link(int link_id, int link_type, String link_name, String link_url, String link_description, int link_rank,
			Byte is_deleted, String create_time) {
		super();
		this.link_id = link_id;
		this.link_type = link_type;
		this.link_name = link_name;
		this.link_url = link_url;
		this.link_description = link_description;
		this.link_rank = link_rank;
		this.is_deleted = is_deleted;
		this.create_time = create_time;
	}

	public Link() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLink_id() {
		return link_id;
	}

	public void setLink_id(int link_id) {
		this.link_id = link_id;
	}

	public int getLink_type() {
		return link_type;
	}

	public void setLink_type(int link_type) {
		this.link_type = link_type;
	}

	public String getLink_name() {
		return link_name;
	}

	public void setLink_name(String link_name) {
		this.link_name = link_name;
	}

	public String getLink_url() {
		return link_url;
	}

	public void setLink_url(String link_url) {
		this.link_url = link_url;
	}

	public String getLink_description() {
		return link_description;
	}

	public void setLink_description(String link_description) {
		this.link_description = link_description;
	}

	public int getLink_rank() {
		return link_rank;
	}

	public void setLink_rank(int link_rank) {
		this.link_rank = link_rank;
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

	@Override
	public String toString() {
		return "Link [link_id=" + link_id + ", link_type=" + link_type + ", link_name=" + link_name + ", link_url="
				+ link_url + ", link_description=" + link_description + ", link_rank=" + link_rank + ", is_deleted="
				+ is_deleted + ", create_time=" + create_time + "]";
	}
	
	
}
