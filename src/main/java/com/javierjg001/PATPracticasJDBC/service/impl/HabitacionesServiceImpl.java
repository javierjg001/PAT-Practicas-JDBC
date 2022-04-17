package com.javierjg001.PATPracticasJDBC.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

import com.javierjg001.PATPracticasJDBC.repository.HabitacionesRepository;
import com.javierjg001.PATPracticasJDBC.service.HabitacionesService;
import com.javierjg001.PATPracticasJDBC.service.dto.HabitacionesDTO;
import com.javierjg001.PATPracticasJDBC.service.dto.HabitacionesProjectionDTO;

@Service
public class HabitacionesServiceImpl implements HabitacionesService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

	@Autowired
	private HabitacionesRepository habitacionesRepository;

    @Override
    public List<HabitacionesDTO> getHabitaciones() {
        return StreamSupport.stream(habitacionesRepository.findAll().spliterator(), false)
				.map(obj -> new OrderDTO(
						obj.getId(),
						obj.getUsuarioId(),
						obj.getCheckInDate()))
				.toList();
    }

    //INNER-JOIN
    @Override
    public List<HabitacionesProjectionDTO> getHabitacionesConUsuarios() {
        String query=
				"""
    			SELECT HABITACIONES.ID, USUARIOS.USUARIO_APELLIDO, USUARIOS.USUARIO_NOMBRE, USUARIOS.PAIS, HABITACIONES.CHECK_IN_DATE
				FROM HABITACIONES
				INNER JOIN USUARIOS ON HABITACIONES.CUSTOMER_ID=USUARIOS.ID;
				""";

		List<HabitacionesProjectionDTO> orderList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new HabitacionesProjectionDTO(
								rs.getLong("ID"),
								rs.getString("USUARIO_APELLIDO"),
								rs.getString("USUARIO_NOMBRE"),
								rs.getString("PAIS"),
								(rs.getTimestamp("CHECK_IN_DATE")!=null) ? rs.getTimestamp("CHECK_IN_DATE").toLocalDateTime() : null
						)
		);

		return orderList;
    }

    //LEFT JOIN
    @Override
    public List<HabitacionesProjectionDTO> getAllHabitaciones() {
        String query=
                """
                    SELECT HABITACIONES.ID, USUARIOS.USUARIO_APELLIDO, USUARIOS.USUARIO_NOMBRE, USUARIOS.PAIS, HABITACIONES.CHECK_IN_DATE
                    FROM HABITACIONES
                    INNER JOIN USUARIOS ON HABITACIONES.CUSTOMER_ID=USUARIOS.ID;
                    """;

		List<HabitacionesProjectionDTO> orderList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new HabitacionesProjectionDTO(
                            rs.getLong("ID"),
                            rs.getString("USUARIO_APELLIDO"),
                            rs.getString("USUARIO_NOMBRE"),
                            rs.getString("PAIS"),
                            (rs.getTimestamp("CHECK_IN_DATE")!=null) ? rs.getTimestamp("CHECK_IN_DATE").toLocalDateTime() : null
						)
		);

		return orderList;
    }

    @Override
    public List<HabitacionesProjectionDTO> getAllHabitaciones2() {
        String query=
                """
                    SELECT HABITACIONES.ID, USUARIOS.USUARIO_APELLIDO, USUARIOS.USUARIO_NOMBRE, USUARIOS.PAIS, HABITACIONES.CHECK_IN_DATE
                    FROM HABITACIONES
                    INNER JOIN USUARIOS ON HABITACIONES.CUSTOMER_ID=USUARIOS.ID;
                    """;

		List<HabitacionesProjectionDTO> orderList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new HabitacionesProjectionDTO(
                            rs.getLong("ID"),
                            rs.getString("USUARIO_APELLIDO"),
                            rs.getString("USUARIO_NOMBRE"),
                            rs.getString("PAIS"),
                            (rs.getTimestamp("CHECK_IN_DATE")!=null) ? rs.getTimestamp("CHECK_IN_DATE").toLocalDateTime() : null
						)
		);

		return orderList;
    }
    
}
