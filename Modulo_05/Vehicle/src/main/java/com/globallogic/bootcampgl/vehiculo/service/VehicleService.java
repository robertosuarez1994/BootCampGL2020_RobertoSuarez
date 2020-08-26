package com.globallogic.bootcampgl.vehiculo.service;

import java.util.List;
import static java.util.Objects.nonNull;

import org.springframework.stereotype.Service;

import com.globallogic.bootcampgl.vehiculo.DTO.VehicleDTO;
import com.globallogic.bootcampgl.vehiculo.entity.Vehicle;
import com.globallogic.bootcampgl.vehiculo.repository.ModelRepository;
import com.globallogic.bootcampgl.vehiculo.repository.TypeRepository;
import com.globallogic.bootcampgl.vehiculo.repository.VehicleRepository;

@Service
public class VehicleService {
	VehicleRepository vehicleRepo;
	TypeRepository typeRepo;
	ModelRepository modelRepo;
	
	public VehicleService(VehicleRepository vehicleRepo,TypeRepository typeRepo, ModelRepository modelRepo){
		this.vehicleRepo = vehicleRepo;
		this.typeRepo = typeRepo;
		this.modelRepo = modelRepo;
	}
	
	public Vehicle save(VehicleDTO vehicleDTO) {
		Vehicle vehicle = new Vehicle();
		vehicle.setCode(vehicleDTO.getCode());
		vehicle.setIdentification(vehicleDTO.getIdentification());
		vehicle.setProd_date(vehicleDTO.getProd_date());
		vehicle.setModel(this.modelRepo.findById(vehicleDTO.getModel_id()).get());
		vehicle.setType(this.typeRepo.findById(vehicleDTO.getType_id()).get());
		return vehicleRepo.save(vehicle);		
	}
	
	public List<Vehicle> findAll() {
		return vehicleRepo.findAll();
	}
	
	public Vehicle findById(Long id) {
		return this.vehicleRepo.findById(id).get();
	}
	
	public Vehicle update(Long id,VehicleDTO vehicleDTO) {
		Vehicle vehicle = this.vehicleRepo.findById(id).get();
		if(nonNull(vehicleDTO.getCode())) {
			vehicle.setCode(vehicleDTO.getCode());
		}
		if(nonNull(vehicleDTO.getIdentification())) {
			vehicle.setIdentification(vehicleDTO.getIdentification());
		}
		if(nonNull(vehicleDTO.getProd_date())) {
			vehicle.setProd_date(vehicleDTO.getProd_date());
		}
		if(nonNull(vehicleDTO.getModel_id())) {
			vehicle.setModel(modelRepo.getOne(vehicleDTO.getModel_id()));
		}
		if(nonNull(vehicleDTO.getType_id())) {
			vehicle.setType(typeRepo.getOne(vehicleDTO.getType_id()));
		}
		
		return vehicleRepo.save(vehicle);
	}
	
	public void delete(Long id) {
		vehicleRepo.delete(vehicleRepo.findById(id).get());
	}
}
