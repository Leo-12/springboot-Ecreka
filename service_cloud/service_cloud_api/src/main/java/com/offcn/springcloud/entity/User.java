package com.offcn.springcloud.entity;

import java.io.Serializable;

public class User implements Serializable {

	private Integer uid;
	private String uname;
	private String pwd;
	private String gender;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public User(Integer uid, String uname, String pwd, String gender) {
		this.uid = uid;
		this.uname = uname;
		this.pwd = pwd;
		this.gender = gender;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User{" +
				"uid=" + uid +
				", uname='" + uname + '\'' +
				", pwd='" + pwd + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}
}
