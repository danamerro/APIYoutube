package com.de.miprimerapirest.service.impl;

import com.de.miprimerapirest.model.dao.ClienteDao;
import com.de.miprimerapirest.model.dto.ClienteDto;
import com.de.miprimerapirest.model.entity.Cliente;
import com.de.miprimerapirest.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public abstract class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDao clienteDao;
    private Cliente cliente;

    @Transactional
    @Override
    public Cliente save(ClienteDto clienteDto) {
        Cliente cliente = Cliente.builder()
                .idCliente(clienteDto
                .getIdCliente())
                .nombre(clienteDto.getNombre())
                .apellido(clienteDto.getApellido())
                .correo(clienteDto.getCorreo())
                .fechaRegistro(clienteDto.getFechaRegistro())
                .build();
        return clienteDao.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(ClienteDto clienteDto) {
        clienteDao.delete(cliente);
    }
}
