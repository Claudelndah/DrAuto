package com.drauto.intervention_app.controllers;

import com.drauto.intervention_app.mappers.ClientMapper;
import com.drauto.intervention_app.mappers.InterventionMapper;
import com.drauto.intervention_app.models.Intervention;
import com.drauto.intervention_app.payloads.requests.InterventionRequest;
import com.drauto.intervention_app.payloads.responses.InterventionResponse;
import com.drauto.intervention_app.services.interfaces.ClientService;
import com.drauto.intervention_app.services.interfaces.InterventionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/Interventions")
@RequiredArgsConstructor
public class InterventionController {
    private final InterventionService service;
    private final ClientService clientService;
    private final InterventionMapper mapper;
    private final ClientMapper clientMapper;


    @PostMapping
    public InterventionResponse create(@RequestBody InterventionRequest interventionRequest) throws Exception{
        Intervention intervention = mapper.convert(interventionRequest);
        intervention.setClient(clientService.findById(interventionRequest.getClientID()));
        intervention = service.create(intervention);
        InterventionResponse response = mapper.convert(intervention);
        response.setClient(clientMapper.convert(intervention.getClient()));
        return mapper.convert(intervention);
    }

    @GetMapping("/{id}")
    public InterventionResponse findById(@PathVariable("id") UUID id) throws Exception{
        return mapper.convert(service.findById(id));
    }

    @GetMapping
    public List<Intervention> findAll(){
        return service.findAll();
    }

    @PutMapping("/{id}")
    public InterventionResponse update(@PathVariable("id") UUID id, @RequestBody InterventionRequest interventionRequest) throws Exception{
        Intervention intervention = mapper.convert(interventionRequest);
        intervention = service.update(intervention, id);
        return mapper.convert(intervention);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") UUID id) throws Exception{
        service.delete(id);
    }

}
