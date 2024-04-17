package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.AirCraft;


public interface AirCraftService {
    AirCraft findById(Long id);
    
    List<AirCraft> findAll();
    
    AirCraft save(AirCraft aircraft);
    
    void deleteById(Long id);
    
    // Additional methods for aircraft management:
    
    List<AirCraft> findByModel(String model);
}

