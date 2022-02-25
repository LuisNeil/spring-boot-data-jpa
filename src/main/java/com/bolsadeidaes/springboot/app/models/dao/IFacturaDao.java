package com.bolsadeidaes.springboot.app.models.dao;

import com.bolsadeidaes.springboot.app.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long> {
}
