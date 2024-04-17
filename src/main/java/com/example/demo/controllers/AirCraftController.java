package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.AirCraft;
import com.example.demo.service.AirCraftService;

import java.util.List;

@RestController
@RequestMapping("/aircrafts")
public class AirCraftController {

    @Autowired
    private AirCraftService airCraftService;

    @GetMapping("/{id}")
    public AirCraft getAirCraftById(@PathVariable Long id) {
        return airCraftService.findById(id);
    }

    @GetMapping
    public List<AirCraft> getAllAirCrafts() {
        return airCraftService.findAll();
    }

    @PostMapping
    public AirCraft createAirCraft(@RequestBody AirCraft airCraft) {
        return airCraftService.save(airCraft);
    }

    @DeleteMapping("/{id}")
    public void deleteAirCraftById(@PathVariable Long id) {
        airCraftService.deleteById(id);
    }

    @GetMapping("/model/{model}")
    public List<AirCraft> getAirCraftsByModel(@PathVariable String model) {
        return airCraftService.findByModel(model);
    }
}
