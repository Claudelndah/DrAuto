package com.drauto.intervention_app.mappers;

import com.drauto.intervention_app.models.Intervention;
import com.drauto.intervention_app.payloads.requests.InterventionRequest;
import com.drauto.intervention_app.payloads.responses.InterventionResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class InterventionMapper {

    public final ModelMapper modelMapper;

    public Intervention convert(InterventionRequest interventionRequest){
        return modelMapper.map(interventionRequest, Intervention.class);
    }

    public InterventionResponse convert(Intervention intervention){
        return modelMapper.map(intervention, InterventionResponse.class);
    }

}
