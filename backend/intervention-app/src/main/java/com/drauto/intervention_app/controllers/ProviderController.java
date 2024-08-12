package com.drauto.intervention_app.controllers;


import com.drauto.intervention_app.mappers.ProviderMapper;
import com.drauto.intervention_app.models.Provider;
import com.drauto.intervention_app.payloads.requests.ProviderRequest;
import com.drauto.intervention_app.payloads.responses.ProviderResponse;
import com.drauto.intervention_app.services.interfaces.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Providers")
@RequiredArgsConstructor
public class ProviderController {

    private final ProviderService service;
    private final ProviderMapper mapper;

    @PostMapping
    public ProviderResponse create(@RequestBody ProviderRequest providerRequest) throws Exception{
        Provider provider = mapper.convert(providerRequest);
        provider = service.create(provider);
        return mapper.convert(provider);
    }

    @GetMapping("/{id}")
    public ProviderResponse findById(@PathVariable("id") UUID id) throws Exception{
        return mapper.convert(service.findById(id));
    }

    @GetMapping
    public List<Provider> findAll(){
        return service.findAll();
    }

    @PutMapping("/{id}")
    public ProviderResponse update(@PathVariable("id") UUID id, @RequestBody ProviderRequest providerRequest) throws Exception{
        Provider provider = mapper.convert(providerRequest);
        provider = service.update(provider, id);
        return mapper.convert(provider);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") UUID id) throws Exception{
        service.delete(id);
    }


}
