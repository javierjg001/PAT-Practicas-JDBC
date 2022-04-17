package com.javierjg001.PATPracticasJDBC.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionesDTO {
    
    Long id;
	Long usuarioId;
	LocalDate checkInDate;
    
    public HabitacionesDTO(Long id, Long usuarioId, LocalDate checkInDate) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.checkInDate = checkInDate;
    }


}
