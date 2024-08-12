package com.drauto.intervention_app.payloads.requests;

import jakarta.validation.constraints.Email;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProviderRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String number;
    private String speciality;
    private String Photo;
    private double note;

}
