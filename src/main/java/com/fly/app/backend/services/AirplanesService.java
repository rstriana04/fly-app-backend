package com.fly.app.backend.services;

import com.fly.app.backend.models.Airplanes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirplanesService extends JpaRepository<Airplanes, Long> {
    Optional<Airplanes> findById(Long primaryKey);

}
