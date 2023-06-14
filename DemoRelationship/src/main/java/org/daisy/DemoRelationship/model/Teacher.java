package org.daisy.DemoRelationship.model;

import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table
public class Teacher implements Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int tid;
	private String salary;
	private String Teachername;
	
//	@ManyToOne
//	private Department department;
	public Teacher(int tid, String salary, String teachername) {
		super();
		this.tid = tid;
		this.salary = salary;
		Teachername = teachername;
	}
	public Teacher()
	{}
	
//	public Department getDep() {
//		return department;
//	}
//	public void setDep(Department department) {
//		this.department = department;
//	}
	public int gettid() {
		return tid;
	}
	public void settid(int tid) {
		this.tid = tid;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getTeachername() {
		return Teachername;
	}
	public void setTeachername(String teachername) {
		Teachername = teachername;
	}	
}
