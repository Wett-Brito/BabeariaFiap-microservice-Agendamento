package com.persistencia.fiap.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="unities")
public class Apointment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="unity_id")
    private Long id;

    private Long idProduct;

	private Long idUnity;

	private String data;

	private Integer horario;

	public Apointment(Long id, Long idProduct, Long idUnity, String data, Integer horario) {
		super();
		this.id = id;
		this.idProduct = idProduct;
		this.idUnity = idUnity;
		this.data = data;
		this.horario = horario;
	}


    
    
}
