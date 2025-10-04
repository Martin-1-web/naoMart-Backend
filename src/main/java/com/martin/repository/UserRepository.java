package com.martin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.martin.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	
}
