package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Ticket;
import com.example.demo.service.TicketService;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.findById(id);
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.findAll();
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicketById(@PathVariable Long id) {
        ticketService.deleteById(id);
    }

    @GetMapping("/bybooking/{bookingId}")
    public List<Ticket> getTicketsByBookingId(@PathVariable Long bookingId) {
        return ticketService.findByBookingId(bookingId);
    }

    @GetMapping("/bypassenger/{passengerId}")
    public List<Ticket> getTicketsByPassengerId(@PathVariable Long passengerId) {
        return ticketService.findByPassengerId(passengerId);
    }
}

