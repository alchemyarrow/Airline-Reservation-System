package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Booking;
import com.example.demo.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        return bookingService.findById(id);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.findAll();
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.save(booking);
    }

    @DeleteMapping("/{id}")
    public void deleteBookingById(@PathVariable Long id) {
        bookingService.deleteById(id);
    }

    @GetMapping("/passenger/{passengerId}")
    public List<Booking> getBookingsByPassengerId(@PathVariable Long passengerId) {
        return bookingService.findByPassengerId(passengerId);
    }

    @GetMapping("/flight/{flightId}")
    public List<Booking> getBookingsByFlightId(@PathVariable Long flightId) {
        return bookingService.findByFlightId(flightId);
    }

    @GetMapping("/status/{status}")
    public List<Booking> getBookingsByStatus(@PathVariable String status) {
        return bookingService.findByBookingStatus(status);
    }
}
