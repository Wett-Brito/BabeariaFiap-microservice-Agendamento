package com.persistencia.fiap.controller;

import com.persistencia.fiap.entities.Appointment;
import com.persistencia.fiap.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/appointments")
public class AppointmentController {

    @Autowired
    AppointmentRepository repository;

    @PostMapping
    public Appointment addAppointment(@RequestBody Appointment appointment){
        return repository.save(appointment);
    }

    @GetMapping
    public List<Appointment> getAllAppointments(){
        return repository.findAll();
    }

}
