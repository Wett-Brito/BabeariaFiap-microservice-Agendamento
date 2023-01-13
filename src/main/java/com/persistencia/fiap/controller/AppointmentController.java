package com.persistencia.fiap.controller;

import java.util.List;

import com.persistencia.fiap.entities.Apointment;
import com.persistencia.fiap.repositories.ApointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/apointments")
public class ApointmentControler {

    @Autowired
    ApointmentRepository repository;

    @PostMapping
    public void addApointment(@RequestBody Apointment apointment){
        repository.save(apointment);
        System.out.println(apointment.getHorario());
    }

}
