package com.javierjg001.PATPracticasJDBC.service;

import java.util.List;

import com.javierjg001.PATPracticasJDBC.service.dto.HabitacionesDTO;
import com.javierjg001.PATPracticasJDBC.service.dto.HabitacionesProjectionDTO;

public interface HabitacionesService {
    
    //toda la info de la tabla de usuarios
    List<HabitacionesDTO> getHabitaciones();

    //INNER-JOIN
    List<HabitacionesProjectionDTO> getHabitacionesConUsuarios();

    //LEFT-JOIN
    List<HabitacionesProjectionDTO> getAllHabitaciones();

    //SANDBOX
    List<HabitacionesProjectionDTO> getAllHabitaciones2();
}
