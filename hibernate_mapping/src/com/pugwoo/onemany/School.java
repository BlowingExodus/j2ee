package com.pugwoo.onemany;

import java.util.Set;

public class School {

	private int id;

	private String schoolName;
	
	/**
	 * school�е�ѧ������ɾ��student�е�school���Ա�ɵ���
	 */
	private Set<Student> students;

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
