package com.javierjg001.PATPracticasJDBC.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("USUARIOS")
public class UsuariosTable {
	private @Column("ID") @Id Long id;
	private @Column("USUARIO_NOMBRE") String usuarioNombre;
	private @Column("USUARIO_APELLIDO") String usuarioApellido;
	private @Column("PAIS") String pais;

}

