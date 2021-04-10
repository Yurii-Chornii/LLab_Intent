package com.intentsg.service.ticket.repositories;

import com.intentsg.service.ticket.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query(value = "SELECT * FROM ticket WHERE user_id = ?1 ORDER BY date", nativeQuery = true)
    List<Ticket> findAllUserTickets(Long userId);
}