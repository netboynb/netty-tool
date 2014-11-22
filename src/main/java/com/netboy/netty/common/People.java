package com.netboy.netty.common;

import java.io.Serializable;

/**
 * TODO Administrator 2013-3-24下午04:23:44
 */
public class People implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
