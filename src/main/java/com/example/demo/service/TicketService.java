package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Ticket;

public interface TicketService {
    Ticket findById(Long id);
    
    List<Ticket> findAll();
    
    Ticket save(Ticket ticket);
    
    void deleteById(Long id);
    
    // Additional methods for ticket management:
    
    List<Ticket> findByBookingId(Long bookingId);
    
    List<Ticket> findByPassengerId(Long passengerId);
    
}

