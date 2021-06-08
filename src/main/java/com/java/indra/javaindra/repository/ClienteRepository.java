package com.java.indra.javaindra.repository;

import ch.qos.logback.core.net.server.Client;
import com.java.indra.javaindra.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
