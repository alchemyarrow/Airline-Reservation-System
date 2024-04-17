package com.example.demo.repository;

import com.example.demo.entity.AirCraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirCraftRepository extends JpaRepository<AirCraft, Long> {
    List<AirCraft> findByModel(String model);
}
