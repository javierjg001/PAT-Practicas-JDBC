package com.javierjg001.PATPracticasJDBC.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuariosDTO {
    Long id;
    String usuarioNombre;
    String usuarioApellido;
    String pais;
    
    public UsuariosDTO(Long id, String usuarioNombre, String usuarioApellido, String pais) {
        this.id = id;
        this.usuarioNombre = usuarioNombre;
        this.usuarioApellido = usuarioApellido;
        this.pais = pais;
    }
}
