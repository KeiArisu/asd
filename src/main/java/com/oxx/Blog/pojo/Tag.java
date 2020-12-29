package com.oxx.Blog.pojo;


public class Tag {
	
	private int tag_id;
	
	private String tag_name;
	
	private Byte is_deleted;
	
	private String create_time;

	public Tag(int tag_id, String tag_name, Byte is_deleted, String create_time) {
		super();
		this.tag_id = tag_id;
		this.tag_name = tag_name;
		this.is_deleted = is_deleted;
		this.create_time = create_time;
	}

	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTag_id() {
		return tag_id;
	}

	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}

	public String getTag_name() {
		return tag_name;
	}

	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;
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
		return "Tag [tag_id=" + tag_id + ", tag_name=" + tag_name + ", is_deleted=" + is_deleted + ", create_time="
				+ create_time + "]";
	}
	
	
}
