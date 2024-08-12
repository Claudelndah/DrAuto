package com.drauto.intervention_app.payloads.responses;

import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProviderResponse {

    private UUID id;
    private String firstname;
    private String lastname;
    private String email;
    private String number;
    private String speciality;
    private String photo;
    private double note;


}
