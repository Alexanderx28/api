package com.example.miapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Saludo API", description = "API que devuelve un saludo simple")
public class SaludoController {

    @Operation(summary = "Devuelve un saludo simple", description = "Este endpoint devuelve un mensaje de saludo.")
    @GetMapping("/api/saludo")
    public String saludo() {
        return "¡Hola javier/Alexander, esta es una API sin base de datos!";
    }
}
