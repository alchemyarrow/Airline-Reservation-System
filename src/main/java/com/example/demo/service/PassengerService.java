package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Passenger;

public interface PassengerService {
    Passenger findById(Long id);
    
    List<Passenger> findAll();
    
    Passenger save(Passenger passenger);
    
    void deleteById(Long id);
    
    // Additional methods for passenger management:
    
    Passenger findByName(String name);
    
}

