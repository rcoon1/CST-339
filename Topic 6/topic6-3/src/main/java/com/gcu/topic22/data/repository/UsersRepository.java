package com.gcu.topic22.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gcu.topic22.data.entity.UserEntity;

public interface UsersRepository extends MongoRepository<UserEntity, String> {

	UserEntity findByUsername(String username);
}
