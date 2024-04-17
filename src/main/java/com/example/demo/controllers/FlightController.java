package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Flight;
import com.example.demo.service.FlightService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.findById(id);
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.findAll();
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.save(flight);
    }

    @DeleteMapping("/{id}")
    public void deleteFlightById(@PathVariable Long id) {
        flightService.deleteById(id);
    }

    @GetMapping("/departure/{airportCode}")
    public List<Flight> getFlightsByDepartureAirport(@PathVariable String airportCode) {
        return flightService.findByDepartureAirport(airportCode);
    }

    @GetMapping("/arrival/{airportCode}")
    public List<Flight> getFlightsByArrivalAirport(@PathVariable String airportCode) {
        return flightService.findByArrivalAirport(airportCode);
    }

    @GetMapping("/between")
    public List<Flight> getFlightsBetweenDepartureTimes(@RequestParam Date startDate, @RequestParam Date endDate) {
        return flightService.findByDepartureTimeBetween(startDate, endDate);
    }

    @GetMapping("/type/{aircraftType}")
    public List<Flight> getFlightsByAircraftType(@PathVariable String aircraftType) {
        return flightService.findByAircraftType(aircraftType);
    }
}
