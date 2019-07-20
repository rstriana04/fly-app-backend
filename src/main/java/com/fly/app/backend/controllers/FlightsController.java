package com.fly.app.backend.controllers;

import com.fly.app.backend.models.Flights;
import com.fly.app.backend.services.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/flights")
@CrossOrigin("http://localhost:4200")
public class FlightsController {

    @Autowired
    private FlightsService flightsService;

    @PostMapping()
    public Flights create(@RequestBody @Valid Flights flights) {
        try {
            Flights saveFlights = flightsService.save(flights);
            return saveFlights;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PutMapping
    public Flights update(@RequestBody Flights flights) {
        try {
            Optional<Flights> FlightsOptional = flightsService.findById(flights.getId());
            if (!FlightsOptional.isPresent()) {
                return null;
            }
            flights.setId(flights.getId());
            flightsService.save(flights);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flights;
    }

    @GetMapping
    public List<Flights> all() {
        try {
            return flightsService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
