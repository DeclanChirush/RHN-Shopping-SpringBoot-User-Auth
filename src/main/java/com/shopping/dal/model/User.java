//Name : Malwatta H.G.
//ID : IT19240848
//Group : REG_WE_03

package com.shopping.dal.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

//Create table
@Document(collection = "users")
public class User {
	
	//user Id is set to auto generate
	@Id
	private String id;
	private String username;
	private String contactNo;
	private String email;
	private String password;
	private String userType;

	//Create M : M relationship
	@DBRef
	private Set<Role> roles = new HashSet<>();

	//Default constructor 
	public User() {
	}

	//Overloaded constructor
	public User(String username,String contactNo,String password,String email,String userType) {
		this.username = username;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}

	//Getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
