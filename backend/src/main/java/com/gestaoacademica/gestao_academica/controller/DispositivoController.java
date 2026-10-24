package com.gestaoacademica.gestao_academica.controller;

import com.gestaoacademica.gestao_academica.model.Dispositivo;
import com.gestaoacademica.gestao_academica.service.DispositivoService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoController {

    private final DispositivoService dispositivoService;

    public DispositivoController(DispositivoService dispositivoService) {
        this.dispositivoService = dispositivoService;
    }

    @PostMapping
    public Dispositivo cadastrar(@RequestBody Dispositivo dispositivo) {
        return dispositivoService.cadastrar(dispositivo);
    }
}
