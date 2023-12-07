package com.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import com.auth.entities.UserEntitie;

public interface UserRepository extends JpaRepository<UserEntitie, String> {
	UserDetails findByLogin(String login);
}
