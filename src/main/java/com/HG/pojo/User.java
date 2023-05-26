package com.HG.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {

	private Integer  uid;
	private String username;
	private String realname;
	private String  password;
	private String flag;
	
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(Integer uid, String username, String realname, String password, String flag) {
		super();
		this.uid = uid;
		this.username = username;
		this.realname = realname;
		this.password = password;
		this.flag = flag;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", realname=" + realname + ", password=" + password
				+ ", flag=" + flag + "]";
	}


	
}
