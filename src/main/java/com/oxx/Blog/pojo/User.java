package com.oxx.Blog.pojo;

public class User {
	//管理员id
	private Integer  admin_user_id;
	//用户名称
	private String login_user_name;
	//用户密码
	private String login_password;
	//用户显示昵称
	private String nick_name;
	//是否锁定 0未锁定 1已锁定无法登陆
	private Integer locked;

	
	public Integer getAdmin_user_id() {
		return admin_user_id;
	}

	public void setAdmin_user_id(Integer admin_user_id) {
		this.admin_user_id = admin_user_id;
	}

	public String getLogin_user_name() {
		return login_user_name;
	}

	public void setLogin_user_name(String login_user_name) {
		this.login_user_name = login_user_name;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public User(Integer admin_user_id, String login_user_name, String login_password, String nick_name,
			Integer locked) {
		super();
		this.admin_user_id = admin_user_id;
		this.login_user_name = login_user_name;
		this.login_password = login_password;
		this.nick_name = nick_name;
		this.locked = locked;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [admin_user_id=" + admin_user_id + ", login_user_name=" + login_user_name + ", login_password="
				+ login_password + ", nick_name=" + nick_name + ", locked=" + locked + "]";
	}

}
