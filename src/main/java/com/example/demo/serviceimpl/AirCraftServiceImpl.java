package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.AirCraft;
import com.example.demo.repository.AirCraftRepository;
import com.example.demo.service.AirCraftService;

@Service
public class AirCraftServiceImpl implements AirCraftService {

    private final AirCraftRepository airCraftRepository;

    public AirCraftServiceImpl(AirCraftRepository airCraftRepository) {
        this.airCraftRepository = airCraftRepository;
    }

    public AirCraft findById(Long id) {
        return airCraftRepository.findById(id).orElse(null);
    }

    public List<AirCraft> findAll() {
        return airCraftRepository.findAll();
    }

    public AirCraft save(AirCraft aircraft) {
        return airCraftRepository.save(aircraft);
    }

    public void deleteById(Long id) {
        airCraftRepository.deleteById(id);
    }

    public List<AirCraft> findByModel(String model) {
        return airCraftRepository.findByModel(model);
    }

}
