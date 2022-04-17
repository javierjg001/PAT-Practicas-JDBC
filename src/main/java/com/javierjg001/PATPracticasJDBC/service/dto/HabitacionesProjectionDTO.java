package com.javierjg001.PATPracticasJDBC.service.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionesProjectionDTO {

    Long id;
	String usuarioNombre;
	String usuarioApellido;
	String pais;
	LocalDateTime checkInDate;

    public HabitacionesProjectionDTO(Long id, String usuarioNombre, String usuarioApellido, String pais,
            LocalDateTime checkInDate) {
        this.id = id;
        this.usuarioNombre = usuarioNombre;
        this.usuarioApellido = usuarioApellido;
        this.pais = pais;
        this.checkInDate = checkInDate;
    }
    
}
