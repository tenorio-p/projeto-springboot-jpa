package com.projeto_tenorio.projeto_spring.resources;


import com.projeto_tenorio.projeto_spring.entities.Product;
import com.projeto_tenorio.projeto_spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> findAllUsers() {
        List<Product> products = productService.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);

    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj =  productService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
