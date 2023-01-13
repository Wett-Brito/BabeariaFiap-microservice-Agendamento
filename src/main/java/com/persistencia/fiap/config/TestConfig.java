package com.persistencia.fiap.config;

import com.persistencia.fiap.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private AppointmentRepository serviceRepository;

	@Override
	public void run(String... args) throws Exception {

//		Appointment s1 = new Appointment(null, 1L, 3L, "Wed Jan 18 2023 00:00:00 GMT-0300 (Horário Padrão de Brasília)", 1000);
//		Appointment s2 = new Appointment(null, 1L, 2L, "Wed Jan 18 2023 00:00:00 GMT-0300 (Horário Padrão de Brasília)", 1000);
//		Appointment s3 = new Appointment(null, 2L, 1L, "Wed Jan 18 2023 00:00:00 GMT-0300 (Horário Padrão de Brasília)", 1100);
//		Appointment s4 = new Appointment(null, 2L, 2L, "Wed Jan 18 2023 00:00:00 GMT-0300 (Horário Padrão de Brasília)", 1230);
//
//		serviceRepository.saveAll(Arrays.asList(s1, s2, s3, s4));

	}
}
