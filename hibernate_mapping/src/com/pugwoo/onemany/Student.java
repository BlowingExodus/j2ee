package com.pugwoo.onemany;

public class Student {

	private int id;
	
	private String stuName;
	
	/**
	 * һ��ѧ������ĳ��ѧУ
	 */
	private School school;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
	
}
