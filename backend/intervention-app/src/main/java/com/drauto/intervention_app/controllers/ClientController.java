package com.drauto.intervention_app.controllers;


import com.drauto.intervention_app.mappers.ClientMapper;
import com.drauto.intervention_app.models.Client;
import com.drauto.intervention_app.payloads.requests.ClientRequest;
import com.drauto.intervention_app.payloads.responses.ClientResponse;
import com.drauto.intervention_app.services.interfaces.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService service;
    private final ClientMapper mapper;

    @PostMapping
    public ClientResponse create(@RequestBody ClientRequest clientRequest) throws Exception{
        Client client = mapper.convert(clientRequest);
        client = service.create(client);
        return mapper.convert(client);
    }

    @GetMapping("/{id}")
    public ClientResponse findById(@PathVariable("id") UUID id) throws Exception{
        return mapper.convert(service.findById(id));
    }

    @GetMapping
    public List<Client> findAll(){
        return service.findAll();
    }

    @PutMapping("/{id}")
    public ClientResponse update(@PathVariable("id") UUID id, @RequestBody ClientRequest clientRequest) throws Exception{
        Client client = mapper.convert(clientRequest);
        client = service.update(client, id);
        return mapper.convert(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") UUID id) throws Exception{
        service.delete(id);
    }

}

