package com.elimeletca.challenge_forohub_one.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.elimeletca.challenge_forohub_one.dtos.DTOAuthentication;
import com.elimeletca.challenge_forohub_one.dtos.DTOJwtToken;
import com.elimeletca.challenge_forohub_one.infra.security.TokenService;
import com.elimeletca.challenge_forohub_one.models.Usuario;


@RestController
@RequestMapping("/login")

public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity realizarLogin(@RequestBody @Valid DTOAuthentication dtoAuthentication) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(dtoAuthentication.username(), dtoAuthentication.password());
        var autenticacion = authenticationManager.authenticate(authenticationToken);
        System.out.println("manda generar el token");
        var tokenJWT = tokenService.generarToken((Usuario) autenticacion.getPrincipal());
        System.out.println("sale de generar token");
        return ResponseEntity.ok(new DTOJwtToken(tokenJWT));
    }
}
