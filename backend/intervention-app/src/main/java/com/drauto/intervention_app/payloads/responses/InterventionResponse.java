
    package com.drauto.intervention_app.payloads.responses;

    import lombok.*;

    import java.util.Date;
    import java.util.UUID;


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public class InterventionResponse {

        private UUID id;
        private Date createdDate;
        private ClientResponse client;
        private String description;
        private Double cost;
        private String state;

    }
    
