package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entity.Flight;

public interface FlightService {
    Flight findById(Long id);
    
    List<Flight> findAll();
    
    Flight save(Flight flight);
    
    void deleteById(Long id);
    
    // Additional methods for flight management:
    
    List<Flight> findByDepartureAirport(String airportCode);
    
    List<Flight> findByArrivalAirport(String airportCode);
    
    List<Flight> findByDepartureTimeBetween(Date startDate, Date endDate);
    
    List<Flight> findByAircraftType(String aircraftType);
    
}
