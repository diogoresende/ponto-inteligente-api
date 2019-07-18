package com.resende.pontointeligente.api.services;

import com.resende.pontointeligente.api.entities.Empresa;
import com.resende.pontointeligente.api.entities.Funcionario;

import java.util.Optional;

public interface FuncionarioService {

    /**
     * Busca e retorna um funcionário dado um CPF
     *
     * @param cpf
     * @return Optional <Funcionario></Funcionario>
     */

    Optional<Funcionario> buscarPorCpf(String cpf);

    /**
     * Busca e retorna um funcionário dado um email
     *
     * @param email
     * @return Optional <Funcionario></Funcionario>
     */

    Optional<Funcionario> buscarPorEmail(String email);

    /**
     * Busca e retorna um funcionário dado um id
     *
     * @param id
     * @return Optional <Funcionario></Funcionario>
     */

    Optional<Funcionario> buscarPorId(Long id);

    /**
     * Cadastra uma nova empresa na base de dados
     *
     * @param funcionario
     * @return Funcionario
     */

    Funcionario persistir(Funcionario funcionario);
}
