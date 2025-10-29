package com.senai.transporte.repository;
import java.util.List;

import com.senai.transporte.model.dao.MotoristaDAO;
import com.senai.transporte.model.entity.Motorista;

// Implementação que usa o DAO
public class MotoristaRepositoryImpl implements MotoristaRepository{
    
    private final MotoristaDAO motoristaDAO = new MotoristaDAO();

    @Override
    public void salvar(Motorista motorista) {
        motoristaDAO.inserir(motorista); 
    }

    @Override
    public List<Motorista> buscarTodos() {
        return motoristaDAO.buscarTodos(); 
    }
}
