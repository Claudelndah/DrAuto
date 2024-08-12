package com.drauto.intervention_app.mappers;

import com.drauto.intervention_app.models.Provider;
import com.drauto.intervention_app.payloads.requests.ProviderRequest;
import com.drauto.intervention_app.payloads.responses.ProviderResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProviderMapper {

    public final ModelMapper modelMapper;

    public Provider convert(ProviderRequest providerRequest){
        return modelMapper.map(providerRequest, Provider.class);
    }

    public ProviderResponse convert(Provider provider){
        return modelMapper.map(provider, ProviderResponse.class);
    }

}
