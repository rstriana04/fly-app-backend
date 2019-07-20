package com.fly.app.backend.controllers;

import com.fly.app.backend.models.Airplanes;
import com.fly.app.backend.services.AirplanesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/airplanes")
@CrossOrigin("http://localhost:4200")
public class AirplanesController {
    @Autowired
    private AirplanesService airplanesService;

    @PostMapping()
    public Airplanes create(@RequestBody @Valid Airplanes airplanes) {
        try {
            Airplanes saveAirplanes = airplanesService.save(airplanes);
            return saveAirplanes;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PutMapping
    public Airplanes update(@RequestBody Airplanes airplanes) {
        try {
            Optional<Airplanes> AirplanesOptional = airplanesService.findById(airplanes.getId());
            if (!AirplanesOptional.isPresent()) {
                return null;
            }
            airplanes.setId(airplanes.getId());
            airplanesService.save(airplanes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return airplanes;
    }

    @GetMapping
    public List<Airplanes> all() {
        try {
            return airplanesService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
