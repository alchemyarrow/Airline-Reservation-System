package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Passenger;
import com.example.demo.service.PassengerService;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @GetMapping("/{id}")
    public Passenger getPassengerById(@PathVariable Long id) {
        return passengerService.findById(id);
    }

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.findAll();
    }

    @PostMapping
    public Passenger createPassenger(@RequestBody Passenger passenger) {
        return passengerService.save(passenger);
    }

    @DeleteMapping("/{id}")
    public void deletePassengerById(@PathVariable Long id) {
        passengerService.deleteById(id);
    }

    @GetMapping("/byname/{name}")
    public Passenger getPassengerByName(@PathVariable String name) {
        return passengerService.findByName(name);
    }
}

