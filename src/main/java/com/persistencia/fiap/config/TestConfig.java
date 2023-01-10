package com.persistencia.fiap.config;

import java.util.Arrays;

import com.persistencia.fiap.entities.Apointment;
import com.persistencia.fiap.repositories.ApointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private ApointmentRepository serviceRepository;

	@Override
	public void run(String... args) throws Exception {

		Apointment s1 = new Apointment(null, 1L, 3L, "Wed Jan 18 2023 00:00:00 GMT-0300 (Horário Padrão de Brasília)", 1000);
		Apointment s2 = new Apointment(null, 1L, 2L, "Wed Jan 18 2023 00:00:00 GMT-0300 (Horário Padrão de Brasília)", 1000);
		Apointment s3 = new Apointment(null, 2L, 1L, "Wed Jan 18 2023 00:00:00 GMT-0300 (Horário Padrão de Brasília)", 1100);
		Apointment s4 = new Apointment(null, 2L, 2L, "Wed Jan 18 2023 00:00:00 GMT-0300 (Horário Padrão de Brasília)", 1230);

		serviceRepository.saveAll(Arrays.asList(s1, s2, s3, s4));

	}
}
