package com.javierjg001.PATPracticasJDBC.repository;

import com.javierjg001.PATPracticasJDBC.model.UsuariosTable;

import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepository extends CrudRepository<UsuariosTable, Long> {
    
}
