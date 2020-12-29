package com.oxx.Blog.util;


public class Result<T> {
	
	private int code;//1表示成功 2表示失败
	
	private String msg;//提示信息
	
	private T data;//保存数据

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(int code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
	
	
}
