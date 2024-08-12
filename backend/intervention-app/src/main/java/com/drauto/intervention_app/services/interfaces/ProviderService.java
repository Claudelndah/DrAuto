package com.drauto.intervention_app.services.interfaces;

import com.drauto.intervention_app.models.Intervention;
import com.drauto.intervention_app.models.Provider;

import java.util.List;
import java.util.UUID;

public interface ProviderService {

    Provider create(Provider provider) throws Exception;

    Provider findById(UUID id) throws Exception;

    List<Provider> findAll();

    Provider update(Provider provider, UUID id) throws Exception;

    void delete(UUID id) throws Exception;

}
