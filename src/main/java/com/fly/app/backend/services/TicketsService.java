package com.fly.app.backend.services;

import com.fly.app.backend.models.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TicketsService extends JpaRepository<Tickets, Long> {
    Optional<Tickets> findById(Long primaryKey);

}
