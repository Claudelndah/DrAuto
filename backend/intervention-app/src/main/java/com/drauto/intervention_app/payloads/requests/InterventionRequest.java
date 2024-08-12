
    package com.drauto.intervention_app.payloads.requests;

    import lombok.*;
    import org.springframework.stereotype.Service;

    import java.util.Date;
    import java.util.UUID;

    @Data
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    public class InterventionRequest {

        private UUID clientID;
        private Date createdDate;
        private String description;
        private Double cost;
        private String state;

        public String toString() {
            return "CategoryRequest{" +
                    "clientID=" + clientID +
                    ", createdDate='" + createdDate + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }

    }
    
