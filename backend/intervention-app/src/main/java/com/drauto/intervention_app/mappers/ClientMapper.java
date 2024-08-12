package com.drauto.intervention_app.mappers;

import com.drauto.intervention_app.models.Client;
import com.drauto.intervention_app.payloads.requests.ClientRequest;
import com.drauto.intervention_app.payloads.responses.ClientResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ClientMapper {

    private final ModelMapper modelMapper;

    public Client convert(ClientRequest clientRequest){
        return modelMapper.map(clientRequest, Client.class);
    }

    public ClientResponse convert(Client client){
        return modelMapper.map(client, ClientResponse.class);
    }

}
