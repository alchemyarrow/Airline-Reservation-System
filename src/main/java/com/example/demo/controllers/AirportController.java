package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Airport;
import com.example.demo.service.AirportService;

import java.util.List;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/{code}")
    public Airport getAirportByCode(@PathVariable String code) {
        return airportService.findById(code);
    }

    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.findAll();
    }

    @PostMapping
    public Airport createAirport(@RequestBody Airport airport) {
        return airportService.save(airport);
    }

    @DeleteMapping("/{code}")
    public void deleteAirportByCode(@PathVariable String code) {
        airportService.deleteById(code);
    }

    @GetMapping("/location/{location}")
    public Airport getAirportByLocation(@PathVariable String location) {
        return airportService.findByLocation(location);
    }
}

