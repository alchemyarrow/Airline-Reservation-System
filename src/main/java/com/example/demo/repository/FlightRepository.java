package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    // Custom query method to find flights by departure airport
    List<Flight> findByDepartureAirport(String departureAirport);
}