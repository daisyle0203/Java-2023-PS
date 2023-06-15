package org.daisy.DemoRelationship.model;

import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String salary;
	private String Teachername;

//	@ManyToOne
//	private Department department;
//	public Teacher(int tid, String salary, String teachername) {
//		super();
//		this.tid = tid;
//		this.salary = salary;
//		Teachername = teachername;
//	}

	@ManyToMany(targetEntity = Cohort.class)
	private Set CohortSet;

	public Teacher(String salary, String teachername, Set CohortSet) {
		this.salary = salary;
		this.Teachername = teachername;
		this.CohortSet = CohortSet;

	}

	public Teacher() {
	}

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

	public Set getCohortSet() {
		return CohortSet;
	}

	public void setCohortSet(Set cohortSet) {
		CohortSet = cohortSet;
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
