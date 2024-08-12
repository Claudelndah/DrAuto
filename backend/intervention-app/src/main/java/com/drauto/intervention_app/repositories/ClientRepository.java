package com.drauto.intervention_app.repositories;

import com.drauto.intervention_app.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}
