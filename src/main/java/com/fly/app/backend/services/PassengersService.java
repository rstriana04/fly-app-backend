package com.fly.app.backend.services;

import com.fly.app.backend.models.Passengers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PassengersService extends JpaRepository<Passengers, Long> {
    Optional<Passengers> findById(Long primaryKey);
}
