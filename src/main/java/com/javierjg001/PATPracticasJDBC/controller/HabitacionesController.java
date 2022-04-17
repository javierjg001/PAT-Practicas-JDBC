package com.javierjg001.PATPracticasJDBC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.javierjg001.PATPracticasJDBC.service.HabitacionesService;
import com.javierjg001.PATPracticasJDBC.service.dto.HabitacionesDTO;
import com.javierjg001.PATPracticasJDBC.service.dto.HabitacionesProjectionDTO;

@RestController
@RequestMapping("/api/v1")
public class HabitacionesController {
    
    @Autowired
    private HabitacionesService habitacionesService;

    @GetMapping("/habitaciones")
    public ResponseEntity<List<HabitacionesDTO>> getHabitaciones() {

        var habitaciones = habitacionesService.getHabitaciones();

        return ResponseEntity.ok().body(habitaciones);
    }

    //INNER-JOIN
    @GetMapping("/habitaciones/con-usuarios")
    public ResponseEntity<List<HabitacionesProjectionDTO>> getHabitacionesConUsuarios() {

        var habitaciones = habitacionesService.getHabitacionesConUsuarios();

        return ResponseEntity.ok().body(habitaciones);
    }

    //LEFT-JOIN
    @GetMapping("/habitaciones/all")
    public ResponseEntity<List<HabitacionesProjectionDTO>> getAllHabitaciones() {

        var habitaciones = habitacionesService.getAllHabitaciones();

        return ResponseEntity.ok().body(habitaciones);
    }

    //SANDBOX
    @GetMapping("/habitaciones/all2")
    public ResponseEntity<List<HabitacionesProjectionDTO>> getAllHabitaciones2() {

        var habitaciones = habitacionesService.getAllHabitaciones2();

        return ResponseEntity.ok().body(habitaciones);
    }
}
