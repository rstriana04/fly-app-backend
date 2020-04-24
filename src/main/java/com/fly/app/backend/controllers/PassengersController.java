package com.fly.app.backend.controllers;

import com.fly.app.backend.models.Passengers;
import com.fly.app.backend.services.PassengersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("/api/v1/passengers")
@CrossOrigin("http://localhost:4300")
public class PassengersController {

    @Autowired
    private PassengersService passengersService;


    @PostMapping()
    public Passengers create(@RequestBody @Valid Passengers passengers) {
        try {
            Passengers savedPassenger = passengersService.save(passengers);
            return savedPassenger;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PutMapping
    public Passengers update(@RequestBody Passengers passengers) {
        try {
            Optional<Passengers> passengersOptional = passengersService.findById(passengers.getId());
            if (!passengersOptional.isPresent()) {
                return null;
            }
            passengers.setId(passengers.getId());
            Passengers passengersSaved = passengersService.save(passengers);
            return passengersSaved;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping
    public List<Passengers> all() {
        try {
            return passengersService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}



