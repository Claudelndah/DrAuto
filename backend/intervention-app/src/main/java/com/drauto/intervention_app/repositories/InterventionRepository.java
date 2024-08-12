package com.drauto.intervention_app.repositories;

import com.drauto.intervention_app.models.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InterventionRepository extends JpaRepository<Intervention, UUID> {
}
