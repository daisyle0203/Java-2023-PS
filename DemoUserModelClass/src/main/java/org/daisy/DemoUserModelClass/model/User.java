package org.daisy.DemoUserModelClass.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(unique = true)
	private String email;

	private String name;
	private String password;
	private String address;
	private String state;
	private String zipCode;

	public User() {
	}

	public User(String email, String name, String password, String address, String state, String zipCode) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.address = address;
		this.state = state;
		this.zipCode = zipCode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + userId;
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof User))
//			return false;
//		User other = (User) obj;
//		if (address == null) {
//			if (other.address != null)
//				return false;
//		} else if (!address.equals(other.address))
//			return false;
//		if (email == null) {
//			if (other.email != null)
//				return false;
//		} else if (!email.equals(other.email))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (password == null) {
//			if (other.password != null)
//				return false;
//		} else if (!password.equals(other.password))
//			return false;
//		if (state == null) {
//			if (other.state != null)
//				return false;
//		} else if (!state.equals(other.state))
//			return false;
//		if (userId != other.userId)
//			return false;
//		if (zipCode == null) {
//			if (other.zipCode != null)
//				return false;
//		} else if (!zipCode.equals(other.zipCode))
//			return false;
//		return true;
//	}

	public boolean equals(Object o) {
		if (this.toString().equals(o.toString())) {
			return true;
		}
		if (o instanceof User) {
			User other = (User) o;
			boolean sameId = (this.userId == other.getUserId());
			boolean sameEmail = (this.email == other.getEmail());
			boolean sameName = (this.name == other.getName());
			boolean samePassword = (this.password == other.getPassword());
			boolean sameAddress = (this.address == other.getAddress());
			boolean sameState = (this.state == other.getState());
			boolean sameZip = (this.zipCode == other.getZipCode());
			if (sameId && sameEmail && sameName && samePassword && sameAddress && sameState && sameZip)
				return true;
		}
		return false;
	}

}