package com.javierjg001.PATPracticasJDBC.controller;

import java.util.List;

import com.javierjg001.PATPracticasJDBC.service.UsuariosService;
import com.javierjg001.PATPracticasJDBC.service.dto.UsuariosDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UsuariosController {
    
    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<UsuariosDTO>> getAllUsuarios2() {

        var habitaciones = usuariosService.getUsuarios();

        return ResponseEntity.ok().body(habitaciones);
    }

    //Usuario-ORDER
    @GetMapping("/usuarios/with-habitaciones")
    public ResponseEntity<List<UsuariosDTO>> getAllUsuarios() {

        var habitaciones = usuariosService.getUsuariosHabitaciones();

        return ResponseEntity.ok().body(habitaciones);
    }
}
