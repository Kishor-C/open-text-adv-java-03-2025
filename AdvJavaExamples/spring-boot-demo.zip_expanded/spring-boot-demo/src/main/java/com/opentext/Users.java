package com.opentext;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// users table - id, name, phone, email

@Entity
@Table(name = "users") // optional because class & table names are same
public class Users {

	@Id // marks this property as primary key 
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-generate the primary key
	private int userId;
	
	private String name;
	
	private long phone;
	
	private String email;
	// setters & getters, toString

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
