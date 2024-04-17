package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Airport;
import com.example.demo.repository.AirportRepository;
import com.example.demo.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;

    public AirportServiceImpl(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    @Override
    public Airport findById(String code) {
        return airportRepository.findById(code).orElse(null);
    }

    @Override
    public List<Airport> findAll() {
        return airportRepository.findAll();
    }

    @Override
    public Airport save(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public void deleteById(String code) {
        airportRepository.deleteById(code);
    }

	@Override
	public Airport findByLocation(String location) {
		return null;
	}
    }

