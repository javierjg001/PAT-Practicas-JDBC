package com.javierjg001.PATPracticasJDBC.service;

import java.util.List;

import com.javierjg001.PATPracticasJDBC.service.dto.HabitacionesDTO;
import com.javierjg001.PATPracticasJDBC.service.dto.HabitacionesProjectionDTO;
import com.javierjg001.PATPracticasJDBC.service.dto.UsuariosDTO;

public interface UsuariosService {
    
    public List<UsuariosDTO> getUsuarios();

    public List<UsuariosDTO> getUsuariosHabitaciones();
}
