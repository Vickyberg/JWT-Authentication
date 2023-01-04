package com.volacode.security.dtos.request;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistrationRequest {

    private  String firstName;
    private String lastName;
    private String email;
    private  String password;

}
