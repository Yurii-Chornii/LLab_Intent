package com.intentsg.service.user.controller;

import com.intentsg.service.user.models.User;
import com.intentsg.service.user.repositories.UserRepository;
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


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    RestTemplate restTemplate;

    private ServiceInstance getServiceInstance() {
        return discoveryClient.getInstances("edge-service").get(0);
    }

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok("user-service");
    }

    @GetMapping("/getOne/{userId}")
    public ResponseEntity<User> getUser(@PathVariable long userId) {
        User user = userRepository.findById(userId).get();
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @GetMapping("/getAllTickets/{userId}")
    public ResponseEntity<String> getAllTicketsSortedByDate(@PathVariable long userId) {
        ServiceInstance serviceInstance = getServiceInstance();
        ResponseEntity<String> forObject = restTemplate.getForEntity(serviceInstance.getUri().toString() + "/api/tickets/getUserTickets/" + userId, String.class);
        return new ResponseEntity(forObject.getBody(), HttpStatus.OK);
    }
}
