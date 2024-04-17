package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
    User findById(Long id);
    
    User findByUsername(String username);
    
    List<User> findAll();
    
    User save(User user);
    
    void deleteById(Long id);
    
    boolean existsById(Long id);
    
    boolean existsByUsername(String username);
    
    // Additional methods for user management:
    
    User updateUser(User user);
    
    List<User> findByRole(String role);
    
}
