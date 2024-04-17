package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Booking;

public interface BookingService {
    Booking findById(Long id);
    
    List<Booking> findAll();
    
    Booking save(Booking booking);
    
    void deleteById(Long id);
    
    // Additional methods for booking management:
    
    List<Booking> findByPassengerId(Long passengerId);
    
    List<Booking> findByFlightId(Long flightId);
    
    List<Booking> findByBookingStatus(String bookingStatus);

}
