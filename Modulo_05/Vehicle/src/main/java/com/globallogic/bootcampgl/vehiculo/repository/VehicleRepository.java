package com.globallogic.bootcampgl.vehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.bootcampgl.vehiculo.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long>{

}
