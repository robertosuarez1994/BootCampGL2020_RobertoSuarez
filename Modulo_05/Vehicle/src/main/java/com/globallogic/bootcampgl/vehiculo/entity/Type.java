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
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "type_id")
	Long id;

	@Column(name = "type_code" , unique = true)
	Long code;
	
	@Column(name = "category")
	String category;
	
	@Column(name = "doors")
	String doors;
	
	//@OneToMany(cascade=CascadeType.ALL)
	//private Set<Vehicle> vehicles;
	
	public Type(){}
}
