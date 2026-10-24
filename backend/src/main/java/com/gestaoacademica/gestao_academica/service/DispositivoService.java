package com.gestaoacademica.gestao_academica.service;

import com.gestaoacademica.gestao_academica.model.Dispositivo;
import com.gestaoacademica.gestao_academica.repository.DispositivoRepository;

import org.springframework.stereotype.Service;

@Service
public class DispositivoService {

    private final DispositivoRepository dispositivoRepository;

    public DispositivoService(DispositivoRepository dispositivoRepository) {
        this.dispositivoRepository = dispositivoRepository;
    }

    public Dispositivo cadastrar(Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }
}