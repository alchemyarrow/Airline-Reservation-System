package com.example.demo.serviceimpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passenger;
import com.example.demo.repository.PassengerRepository;
import com.example.demo.service.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public Passenger findById(Long id) {
        return passengerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Passenger> findAll() {
        return passengerRepository.findAll();
    }

    @Override
    public Passenger save(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public void deleteById(Long id) {
        passengerRepository.deleteById(id);
    }

	@Override
	public Passenger findByName(String name) {
		return null;
	}

}
