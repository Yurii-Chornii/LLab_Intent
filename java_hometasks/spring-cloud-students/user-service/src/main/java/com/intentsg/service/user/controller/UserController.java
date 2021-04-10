package com.intentsg.service.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/users")
public class UserController {

	@GetMapping("/test")
	public ResponseEntity test() {
		return ResponseEntity.ok("user-service");
	}
}
