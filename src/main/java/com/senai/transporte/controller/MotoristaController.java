package com.senai.transporte.controller;

import java.util.List;

import com.senai.transporte.model.entity.Motorista;
import com.senai.transporte.service.MotoristaService;

// Intermediário entre a View e o Service
public class MotoristaController {

    private final MotoristaService service = new MotoristaService();

    public void salvar(String nome, String cpf) {
        service.salvarMotorista(nome, cpf); 
    }

    public List<Motorista> listarTodos() {
        return service.buscarTodos();
    }
}
