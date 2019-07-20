package com.fly.app.backend.controllers;

import com.fly.app.backend.models.Tickets;
import com.fly.app.backend.services.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/tickets")
@CrossOrigin("http://localhost:4200")
public class TicketsController {

    @Autowired
    private TicketsService ticketsService;

    @PostMapping()
    public Tickets create(@RequestBody @Valid Tickets tickets) {
        try {
            Tickets saveTickets = ticketsService.save(tickets);
            return saveTickets;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PutMapping
    public Tickets update(@RequestBody Tickets tickets) {
        try {
            Optional<Tickets> TicketsOptional = ticketsService.findById(tickets.getId());
            if (!TicketsOptional.isPresent()) {
                return null;
            }
            tickets.setId(tickets.getId());
            ticketsService.save(tickets);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tickets;
    }

    @GetMapping
    public List<Tickets> all() {
        try {
            return ticketsService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
