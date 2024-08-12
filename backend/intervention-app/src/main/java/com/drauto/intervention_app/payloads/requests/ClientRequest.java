package com.drauto.intervention_app.payloads.requests;


import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.stereotype.Service;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String number;

}
