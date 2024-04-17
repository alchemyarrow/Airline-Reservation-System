package com.example.demo.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Flight;
import com.example.demo.repository.FlightRepository;
import com.example.demo.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;


    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public Flight findById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }

    @Override
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    @Override
    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public void deleteById(Long id) {
        flightRepository.deleteById(id);
    }

    @Override
    public List<Flight> findByDepartureAirport(String airportCode) {
        return flightRepository.findByDepartureAirport(airportCode);
    }

    @Override
    public List<Flight> findByArrivalAirport(String airportCode) {
        // Implement this method if needed
        return null;
    }

    @Override
    public List<Flight> findByDepartureTimeBetween(Date startDate, Date endDate) {
        // Implement this method if needed
        return null;
    }

    @Override
    public List<Flight> findByAircraftType(String aircraftType) {
        // Implement this method if needed
        return null;
    }
  
}
