package com.de.miprimerapirest.model.dao;

import com.de.miprimerapirest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
