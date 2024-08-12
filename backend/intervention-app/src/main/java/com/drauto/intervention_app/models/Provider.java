package com.drauto.intervention_app.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Entity
@Data
@Table
@Getter
@Setter
public class Provider {

    @Id
    @GeneratedValue
    private UUID id;

    @Autowired
    private String firstname;
    private String lastname;
    private String email;
    private String number;
    private String speciality;
    private String Photo;
    private double note;


}
