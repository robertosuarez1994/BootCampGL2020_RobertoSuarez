package com.globallogic.bootcampgl.vehiculo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.vehiculo.DTO.TypeDTO;
import com.globallogic.bootcampgl.vehiculo.entity.Type;
import com.globallogic.bootcampgl.vehiculo.repository.TypeRepository;

@RestController
public class TypeController {
	
	TypeRepository typeRepo;
	
	public TypeController(TypeRepository typeRepo) {
		this.typeRepo = typeRepo;
	}
	
	@PostMapping(value = "/types")
	public ResponseEntity<Object> create(@RequestBody TypeDTO typeDTO) {
		Type type = new Type();
		type.setCode(typeDTO.getCode());
		type.setCategory(typeDTO.getCategory());
		type.setDoors(typeDTO.getDoors());
		return new ResponseEntity<>(typeRepo.save(type),HttpStatus.OK);
	}
	
	
}
