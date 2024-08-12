package com.drauto.intervention_app.services.impls;

import com.drauto.intervention_app.models.Intervention;
import com.drauto.intervention_app.repositories.InterventionRepository;
import com.drauto.intervention_app.services.interfaces.InterventionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor

public class InterventionServiceImpl implements InterventionService {

    private final  InterventionRepository repository;

    @Override
    public Intervention create(Intervention intervention) throws Exception {
        return repository.save(intervention);
    }

    @Override
    public Intervention findById(UUID id) throws Exception {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Intervention> findAll() {
        return repository.findAll();
    }

    @Override
    public Intervention update(Intervention intervention, UUID id) throws Exception {
        findById(id);
        return repository.save(intervention);
    }

    @Override
    public void delete(UUID id) throws Exception {
        Intervention intervention = findById(id);
        repository.delete(intervention);
    }
}
