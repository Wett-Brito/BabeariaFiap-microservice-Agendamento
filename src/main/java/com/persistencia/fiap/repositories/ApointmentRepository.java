package com.persistencia.fiap.repositories;

import com.persistencia.fiap.entities.Apointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApointmentRepository extends JpaRepository<Apointment, Long>{
}
