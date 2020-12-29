package com.oxx.Blog.pojo;

import java.util.Date;

public class Category {
		private int category_id;

	    private String category_name;

	    private String category_icon;

	    private int category_rank;

	    private Byte is_deleted;

	    private Date create_time;
	    

	    public Category(int category_id, String category_name, String category_icon, int category_rank, Byte is_deleted, Date create_time) {
	        this.category_id = category_id;
	        this.category_name = category_name;
	        this.category_icon = category_icon;
	        this.category_rank = category_rank;
	        this.is_deleted = is_deleted;
	        this.create_time = create_time;
	    }

	    public Category() {
	        super();
	    }

	    public int getCategory_id() {
	        return category_id;
	    }

	    public void setCategory_id(int category_id) {
	        this.category_id = category_id;
	    }

	    public String getCategory_name() {
	        return category_name;
	    }

	    public void setCategory_name(String category_name) {
	        this.category_name = category_name == null ? null : category_name.trim();
	    }

	    public String getCategory_icon() {
	        return category_icon;
	    }

	    public void setCategory_icon(String category_icon) {
	        this.category_icon = category_icon == null ? null : category_icon.trim();
	    }

	    public int getCategory_rank() {
	        return category_rank;
	    }

	    public void setCategory_rankk(int category_rank) {
	        this.category_rank = category_rank;
	    }

	    public Byte getIs_deleted() {
	        return is_deleted;
	    }

	    public void setIs_deleted(Byte is_deleted) {
	        this.is_deleted = is_deleted;
	    }

	    public Date getCreate_time() {
	        return create_time;
	    }

	    public void setCreate_time(Date create_time) {
	        this.create_time = create_time;
	    }

	    
	    
}
