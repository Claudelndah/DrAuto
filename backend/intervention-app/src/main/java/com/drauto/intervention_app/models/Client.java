package com.drauto.intervention_app.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@Table
public class Client {

    @Id
    @GeneratedValue
    private UUID id;

    private String firstname;
    private String lastname;
    private String email;
    private String number;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Intervention> interventions;

}
