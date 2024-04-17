package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Payment;

public interface PaymentService {
    Payment findById(Long id);
    
    List<Payment> findAll();
    
    Payment save(Payment payment);
    
    void deleteById(Long id);
    
    // Additional methods for payment management:
    
    List<Payment> findByBookingId(Long bookingId);
    
    List<Payment> findByPaymentStatus(String paymentStatus);
 
}
