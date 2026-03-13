package com.projeto_tenorio.projeto_spring.resources;


import com.projeto_tenorio.projeto_spring.entities.Order;
import com.projeto_tenorio.projeto_spring.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> finAllUsers() {
        List<Order> users = orderService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);

    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj =  orderService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
