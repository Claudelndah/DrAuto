package com.drauto.intervention_app.services.interfaces;

import com.drauto.intervention_app.models.Client;
import com.drauto.intervention_app.models.Intervention;

import java.util.List;
import java.util.UUID;

public interface ClientService {

    Client create(Client client) throws Exception;

    Client findById(UUID id) throws Exception;

    List<Client> findAll();

    Client update(Client client, UUID id) throws Exception;

    void delete(UUID id) throws Exception;

}
