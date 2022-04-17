package com.javierjg001.PATPracticasJDBC.repository;

import com.javierjg001.PATPracticasJDBC.model.HabitacionesTable;

import org.springframework.data.repository.CrudRepository;

public interface HabitacionesRepository extends  CrudRepository<HabitacionesTable, Long> {
    
}
