package com.de.miprimerapirest.service;

import com.de.miprimerapirest.model.entity.Cliente;

public interface ICliente {
    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);

}
