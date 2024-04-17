package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query method to find a user by username
    Optional<User> findByUsername(String username);

	List<User> findById(String role);

	boolean exists(String username);

	boolean existsById(String username);

	List<User> findById1(String role);

	boolean existsByUsername(String username);
}
