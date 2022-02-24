package com.bolsadeidaes.springboot.app.models.service;

import com.bolsadeidaes.springboot.app.models.entity.Cliente;
import com.bolsadeidaes.springboot.app.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);

    public Page<Cliente> findAll(Pageable pageable);

    public List<Producto> findByNombre(String term);
}
