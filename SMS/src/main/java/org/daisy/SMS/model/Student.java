package org.daisy.SMS.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@Column(name = "email", nullable = false, length = 50)
	private String sEmail;
	
	@Column(name = "name",  nullable = false, length = 50)
	private String sName;
	
	@Column(name = "password", nullable = false, length = 50)
	private String sPassword;
	
	@ManyToMany(cascade =CascadeType.ALL)
	@JoinTable(name = "Student_course", joinColumns =@JoinColumn(name = "email"), inverseJoinColumns =@JoinColumn(name = "id"))
	private List<Course> sCourses;

	public Student() {
	}

	public Student(String sEmail, String sName, String sPassword, List<Course> sCourses) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPassword = sPassword;
		this.sCourses = sCourses;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

}
