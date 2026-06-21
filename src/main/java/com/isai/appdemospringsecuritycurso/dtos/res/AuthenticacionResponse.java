package com.isai.appdemospringsecuritycurso.dtos.res;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthenticacionResponse {
    private String jwt;
}
