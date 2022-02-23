package com.gcu.topic22.data;

public interface UsersDataAccessInterface <T> {

	public T findByUsername(String username);
}
