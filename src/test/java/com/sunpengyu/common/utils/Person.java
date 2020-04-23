package com.sunpengyu.common.utils;

import java.util.Date;

public class Person {

	private String name;
	private Integer age;
	private String about;
	private Date created;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return this.age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAbout() {
		return this.about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Person [name=" + this.name + ", age=" + this.age + ", about=" + this.about + ", created=" + this.created
				+ "]";
	}
	
	
	
}
