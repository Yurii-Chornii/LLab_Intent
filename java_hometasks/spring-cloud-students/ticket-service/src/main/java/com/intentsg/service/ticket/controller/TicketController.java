package com.intentsg.service.ticket.controller;

import com.intentsg.service.ticket.models.Ticket;
import com.intentsg.service.ticket.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Controller
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    RestTemplate restTemplate;

    private ServiceInstance getServiceInstance() {
        return discoveryClient.getInstances("edge-service").get(0);
    }

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok("ticket-service");
    }

    @GetMapping("/getUser/{ticketId}")
    public ResponseEntity<String> returnUserByTicketId(@PathVariable long ticketId) {
        Ticket ticket = ticketRepository.getOne(ticketId);
        ServiceInstance serviceInstance = getServiceInstance();
        ResponseEntity<String> forObject = restTemplate.getForEntity(serviceInstance.getUri().toString() + "/api/users/getOne/" + ticket.getUserId(), String.class);
        return new ResponseEntity(forObject.getBody(), HttpStatus.OK);
    }

    @GetMapping("/getUserTickets/{userId}")
    public ResponseEntity<List<Ticket>> getUserTickets(@PathVariable long userId) {
        List<Ticket> ticketList = ticketRepository.findAllUserTickets(userId);
        System.out.println(ticketList);
        return new ResponseEntity(ticketList, HttpStatus.OK);
    }
}
