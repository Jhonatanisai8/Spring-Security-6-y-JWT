package com.isai.appdemospringsecuritycurso.dtos.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticacionRequest {
    private String username;
    private String password;
}
