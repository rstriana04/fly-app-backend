package com.fly.app.backend.services;

import com.fly.app.backend.models.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightsService extends JpaRepository<Flights, Long> {
    Optional<Flights> findById(Long primaryKey);

}
