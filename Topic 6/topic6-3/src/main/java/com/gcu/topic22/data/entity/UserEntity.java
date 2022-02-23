package com.gcu.topic22.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserEntity {

	@Id
	String id;
	@Indexed(unique = true)
	String username;
	String password;

	public UserEntity(String id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public String getID() {
		return id;
	}

	public void setID(String ID) {
		this.id = ID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
