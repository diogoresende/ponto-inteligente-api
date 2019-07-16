package com.resende.pontointeligente.api.repositories;

import com.resende.pontointeligente.api.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    @Transactional(readOnly = true)
    Empresa findbyCnpj(String cnpj);

}
