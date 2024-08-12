package com.drauto.intervention_app.services.impls;

import com.drauto.intervention_app.models.Client;
import com.drauto.intervention_app.repositories.ClientRepository;
import com.drauto.intervention_app.services.interfaces.ClientService;
import com.drauto.intervention_app.services.interfaces.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;

    @Override
    public Client create(Client client) throws Exception {
        return repository.save(client);
    }

    @Override
    public Client findById(UUID id) throws Exception {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public Client update(Client client, UUID id) throws Exception {
        findById(id);
        return repository.save(client);
    }

    @Override
    public void delete(UUID id) throws Exception {
        Client client = findById(id);
        repository.delete(client);
    }
}
