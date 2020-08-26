package com.globallogic.bootcampgl.vehiculo.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	Long id;
	
	@Column(name = "vehicle_code" , unique = true)
	Long code;
	
	String identification;
	
	Date prod_date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Model model;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Type type;
	
	public Vehicle() {}
	
	
}
