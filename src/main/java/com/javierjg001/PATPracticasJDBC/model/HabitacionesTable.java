package com.javierjg001.PATPracticasJDBC.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("HABITACIONES")
public class HabitacionesTable {
	private @Column("ID") @Id Long id;
	private @Column("USUARIO_NOMBRE") String usuarioNombre;
	private @Column("CHECK_IN_DATE") LocalDate country;

}

