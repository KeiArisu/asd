package com.oxx.Blog.pojo;

public class Config {
	
	private String config_name;
	
	private String config_value;
	
	private String create_time;
	
	private String update_time;
	
	public Config() {
		// TODO Auto-generated constructor stub
	}

	public Config(String config_name, String config_value, String create_time, String update_time) {
		super();
		this.config_name = config_name;
		this.config_value = config_value;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public String getConfig_name() {
		return config_name;
	}

	public void setConfig_name(String config_name) {
		this.config_name = config_name;
	}

	public String getConfig_value() {
		return config_value;
	}

	public void setConfig_value(String config_value) {
		this.config_value = config_value;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "Config [config_name=" + config_name + ", config_value=" + config_value + ", create_time=" + create_time
				+ ", update_time=" + update_time + "]";
	}
}
