package org.daisy.HibernateJPABeginner.model;

import jakarta.persistence.*;

@Entity // not necessary since by default it is entity
@Table(name = "USER")
public class User {
	@Column(name = "USER_ID") // by default it is Id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // specifies that the generated values are unique at table level
	private Integer id;
	private String fullName;
	private String email;
	private String password;
	private int age;
	private double salary;
	private String city;

	public User(String fullName, String email, String password, int age, double salary, String city) {
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.age = age;
		this.salary = salary;
		this.city = city;
	}

	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getfullName() {
		return fullName;
	}

	public void setfullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
