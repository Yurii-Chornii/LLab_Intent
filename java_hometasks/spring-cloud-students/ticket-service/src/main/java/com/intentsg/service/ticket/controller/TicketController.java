package com.intentsg.service.ticket.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tickets")
public class TicketController {

	@GetMapping("/test")
	public ResponseEntity test() {
		return ResponseEntity.ok("ticket-service");
	}
}
