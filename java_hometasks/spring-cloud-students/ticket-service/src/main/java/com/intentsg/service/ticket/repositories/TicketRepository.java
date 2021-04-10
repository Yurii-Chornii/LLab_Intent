package com.intentsg.service.ticket.repositories;

import com.intentsg.service.ticket.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
