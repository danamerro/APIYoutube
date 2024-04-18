package com.de.miprimerapirest.service;

import com.de.miprimerapirest.model.dto.ClienteDto;
import com.de.miprimerapirest.model.entity.Cliente;

import org.springframework.transaction.annotation.Transactional;

public interface ICliente {
    Cliente save(ClienteDto clienteDto);
    Cliente findById(Integer id);
    void delete(Cliente cliente);

    @Transactional
    void delete(ClienteDto clienteDto);
}
