package com.ecom.Ecommerce.Repository;

import com.ecom.Ecommerce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    // findByEmail for login
	Optional<User> findByEmail(String email);

   
}
