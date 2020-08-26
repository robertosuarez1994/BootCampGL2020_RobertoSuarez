package com.globallogic.bootcampgl.vehiculo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "model_id")
	private Long id;
	
	@Column(name = "model_code" , unique = true)
	Long code;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "name")
	private String name;
	
	//@OneToMany(cascade=CascadeType.ALL)
	//private Set<Vehicle> vehicles;
	
	public Model() {}
}
