package com.globallogic.bootcampgl.vehiculo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.vehiculo.DTO.ModelDTO;
import com.globallogic.bootcampgl.vehiculo.entity.Model;
import com.globallogic.bootcampgl.vehiculo.repository.ModelRepository;

@RestController
public class ModelController {

	ModelRepository modelRepo;
	
	public ModelController(ModelRepository modelRepo) {
		this.modelRepo = modelRepo;
	}
	
	@PostMapping(value = "/models")
	public ResponseEntity<Object> create(@RequestBody ModelDTO modelDTO) {
		Model model = new Model();
		model.setCode(modelDTO.getCode());
		model.setBrand(modelDTO.getBrand());
		model.setName(modelDTO.getName());
		return new ResponseEntity<>(modelRepo.save(model),HttpStatus.OK);
	}
}
