package com.drauto.intervention_app.services.interfaces;

import com.drauto.intervention_app.models.Intervention;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface InterventionService{

    Intervention create(Intervention intervention) throws Exception;

    Intervention findById(UUID id) throws Exception;

    List<Intervention> findAll();

    Intervention update(Intervention intervention, UUID id) throws Exception;

    void delete(UUID id) throws Exception;

}
