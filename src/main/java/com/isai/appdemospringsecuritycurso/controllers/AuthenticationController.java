package com.isai.appdemospringsecuritycurso.controllers;


import com.isai.appdemospringsecuritycurso.dtos.req.AuthenticacionRequest;
import com.isai.appdemospringsecuritycurso.dtos.res.AuthenticacionResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @PostMapping("/login")
    public ResponseEntity<AuthenticacionResponse> login(
            @RequestBody @Valid AuthenticacionRequest authenticacionRequest) {
        return null;

    }
}
