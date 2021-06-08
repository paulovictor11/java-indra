package com.java.indra.javaindra.controller;

import com.java.indra.javaindra.model.Cliente;
import com.java.indra.javaindra.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> list() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cliente> save(@Valid @RequestBody Cliente cliente) {
        repository.save(cliente);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }
}
