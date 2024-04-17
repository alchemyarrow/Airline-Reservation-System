package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Airport;

public interface AirportService {
    Airport findById(String code);
    
    List<Airport> findAll();
    
    Airport save(Airport airport);
    
    void deleteById(String code);
    
    // Additional methods for airport management:
    
    Airport findByLocation(String location);
  
}

