package com.drauto.intervention_app.services.impls;

import com.drauto.intervention_app.models.Provider;
import com.drauto.intervention_app.repositories.ProviderRepository;
import com.drauto.intervention_app.services.interfaces.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProviderServiceImpl implements ProviderService {

    private final ProviderRepository repository;

    @Override
    public Provider create(Provider provider) throws Exception {
        return repository.save(provider);
    }

    @Override
    public Provider findById(UUID id) throws Exception {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Provider> findAll() {
        return repository.findAll();
    }

    @Override
    public Provider update(Provider provider, UUID id) throws Exception {
        findById(id);
        return repository.save(provider);
    }

    @Override
    public void delete(UUID id) throws Exception {
        Provider provider = findById(id);
        repository.delete(provider);
    }
}
