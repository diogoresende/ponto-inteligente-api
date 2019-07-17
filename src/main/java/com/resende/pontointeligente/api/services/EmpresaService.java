package com.resende.pontointeligente.api.services;

import com.resende.pontointeligente.api.entities.Empresa;

import java.util.Optional;

public interface EmpresaService {

    /**
     * Retorna uma empresa dado um CNPJ
     *
     * @param cnpj
     * @return Optional <Empresa></Empresa>
     */

    Optional<Empresa> buscarPorCnpj(String cnpj);

    /**
     * Cadastra uma nova empresa na base de dados
     *
     * @param empresa
     * @return Empresa
     */

    Empresa persistir(Empresa empresa);
}
