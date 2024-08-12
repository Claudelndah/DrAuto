package com.drauto.intervention_app.models;

    import jakarta.persistence.*;
    import lombok.Data;
    import lombok.Getter;
    import lombok.Setter;

    import java.util.Date;
    import java.util.UUID;


    @Entity
    @Data
    @Table
    @Setter
    @Getter

    public class Intervention {

        @Id
        @GeneratedValue
        private UUID id;

        private Date createdDate;
        private String description;
        private Double cost;
        private String state;

        @ManyToOne
        @JoinColumn(name = "clientId")
        private Client client;

    }
