package com.javierjg001.PATPracticasJDBC.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

import com.javierjg001.PATPracticasJDBC.repository.UsuariosRepository;
import com.javierjg001.PATPracticasJDBC.service.UsuariosService;
import com.javierjg001.PATPracticasJDBC.service.dto.UsuariosDTO;

@Service
public class UsuariosServiceImpl implements UsuariosService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
	private UsuariosRepository usuariosRepository;

    @Override
    public List<UsuariosDTO> getUsuarios() {
        return StreamSupport.stream(usuariosRepository.findAll().spliterator(), false)
				.map(obj -> new UsuariosDTO(
						obj.getId(),
						obj.getUsuarioNombre(),
						obj.getUsuarioApellido(),
						obj.getPais()))
				.toList();
        
    }

    @Override
    public List<UsuariosDTO> getUsuariosHabitaciones() {
        String query=
    			"""
    			SELECT U.ID, U.USUARIO_APELLIDO, U.USUARIO_NOMBRE, U.PAIS
				FROM USUARIOS U, HABITACIONES H
				WHERE U.ID=H.USUARIO:ID;
				""";

		List<UsuariosDTO> orderList = jdbcTemplate.query(
				query,
				(rs, rowNum) ->
						new UsuariosDTO(
								rs.getLong("ID"),
								rs.getString("USUARIO_APELLIDO"),
								rs.getString("USUARIO_NOMBRE"),
								rs.getString("PAIS"))
		);

		return orderList;
    }
    
}
