package com.drauto.intervention_app.repositories;

import com.drauto.intervention_app.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProviderRepository extends JpaRepository<Provider, UUID> {
}
