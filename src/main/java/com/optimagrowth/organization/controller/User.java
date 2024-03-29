package com.optimagrowth.organization.controller;

import java.util.List;
import java.util.Objects;

public class User {
	private String username;
	private String firstName;
	private String lastName;
	private List<String> roles;

	public User() {
	}

	public User(String username, String firstName, String lastName, List<String> roles) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, roles, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(roles, other.roles) && Objects.equals(username, other.username);
	}
	
	
}
