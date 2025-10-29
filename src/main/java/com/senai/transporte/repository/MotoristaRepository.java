package com.senai.transporte.repository;

import java.util.List;

import com.senai.transporte.model.entity.Motorista;

// Define o contrato de domínio
public interface MotoristaRepository {
    void salvar(Motorista motorista);
    List<Motorista> buscarTodos();
   //Motorista buscarPorId(int id);// Listar por id => Update
}
