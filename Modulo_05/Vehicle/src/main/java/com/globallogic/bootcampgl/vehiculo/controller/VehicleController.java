package com.globallogic.bootcampgl.vehiculo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.bootcampgl.vehiculo.DTO.VehicleDTO;
import com.globallogic.bootcampgl.vehiculo.entity.Vehicle;
import com.globallogic.bootcampgl.vehiculo.service.VehicleService;


@RestController
@RequestMapping("/vehicles")
public class VehicleController {
	
	VehicleService vehicleService;
	
	VehicleController(VehicleService vehicleService){
		this.vehicleService = vehicleService;
	}
	
	@GetMapping(value = "")
	public ResponseEntity<Iterable<Vehicle>> findAll() {
		return new ResponseEntity<>(vehicleService.findAll(),HttpStatus.OK);
	}
	
	@PostMapping(value = "")
	public ResponseEntity<Vehicle> create(@RequestBody VehicleDTO vehicleDTO) {
		return new ResponseEntity<>(vehicleService.save(vehicleDTO),HttpStatus.CREATED);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Vehicle> findById(@PathVariable Long id){
		return new ResponseEntity<>(vehicleService.findById(id),HttpStatus.OK);
	}
	
	@PutMapping(value="/{id}")
	public ResponseEntity<String> update(@PathVariable Long id,@RequestBody VehicleDTO vehicleDTO) {
		vehicleService.update(id,vehicleDTO);
		return new ResponseEntity<>("change successful",HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		vehicleService.delete(id);
		return new ResponseEntity<>("deleted",HttpStatus.OK);
	}
}
