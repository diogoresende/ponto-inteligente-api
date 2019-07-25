package com.resende.pontointeligente.api.services.impl;

import com.resende.pontointeligente.api.entities.Funcionario;
import com.resende.pontointeligente.api.repositories.FuncionarioRepository;
import com.resende.pontointeligente.api.services.FuncionarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public Funcionario persistir(Funcionario funcionario){
        log.info("Persistindo funcionário: {}", funcionario);
        return this.funcionarioRepository.save(funcionario);
    }

    public Optional<Funcionario> buscarPorCpf(String cpf){
        log.info("Buscando um funcionário para o CPF {}", cpf);
        return Optional.ofNullable(funcionarioRepository.findByCpf(cpf));
    }

    public Optional<Funcionario> buscarPorEmail(String email){
        log.info("Buscando um funcionário para o email {}", email);
        return Optional.ofNullable(funcionarioRepository.findByEmail(email));
    }

    public Optional<Funcionario> buscarPorId(Long id){
        log.info("Buscando um funcionário pelo ID {}", id);
        return Optional.ofNullable(funcionarioRepository.findOne(id));
    }
}
