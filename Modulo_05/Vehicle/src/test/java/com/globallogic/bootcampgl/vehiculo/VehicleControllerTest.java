package com.globallogic.bootcampgl.vehiculo;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.internal.stubbing.answers.DoesNothing;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.globallogic.bootcampgl.vehiculo.DTO.ErrorDTO;
import com.globallogic.bootcampgl.vehiculo.DTO.VehicleDTO;
import com.globallogic.bootcampgl.vehiculo.controller.VehicleController;
import com.globallogic.bootcampgl.vehiculo.entity.Model;
import com.globallogic.bootcampgl.vehiculo.entity.Type;
import com.globallogic.bootcampgl.vehiculo.entity.Vehicle;
import com.globallogic.bootcampgl.vehiculo.service.VehicleService;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)
public class VehicleControllerTest {
	@Mock
	VehicleService vehicleService;
	
	@InjectMocks
	VehicleController vehicleController;
	
	VehicleDTO vehicleDTO1;
	Vehicle vehicle1;
	Model model1;
	Type type1;
	ResponseEntity response;
	ErrorDTO errorDTO;
	List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	
	@BeforeEach
	public void setup() {
		Date dateMock = new Date();
		model1 = new Model(1L,12L,"modelo1","sarasa");
		type1 = new Type(1l,12l,"sarasaa","sarasa");
		vehicle1 = new Vehicle(1L,123L,"ident",dateMock,model1,type1);
		vehicleDTO1 = new VehicleDTO();
		errorDTO = new ErrorDTO();
		vehicleDTO1.setCode(123L);
		vehicleDTO1.setProd_date(vehicle1.getProd_date());
		vehicleDTO1.setIdentification(vehicle1.getIdentification());
		vehicleDTO1.setModel_id(model1.getId());
		vehicleDTO1.setType_id(type1.getId());
		vehicles.add(vehicle1);
	}
	
	@Test
	@DisplayName(value="get_by_id")
	public void get_by_id_successful() {
		when(vehicleService.findById(1L)).thenReturn(vehicle1);
		response = new ResponseEntity(vehicle1,HttpStatus.OK);
		assertTrue(vehicleController.findById(1L).equals(response));
		
	}
	

	@Test
	@DisplayName(value = "getById_notFound")
	public void get_by_id_when_id_not_found() {
		when(vehicleService.findById(1L)).thenThrow(NoSuchElementException.class);
		assertThatThrownBy(() -> {
			vehicleController.findById(1L);
		}).isInstanceOf(NoSuchElementException.class);
	}
	
	@Test
	@DisplayName(value="get_all_successful")
	public void get_all_vehicles() {
		when(vehicleService.findAll()).thenReturn(vehicles);
		response = new ResponseEntity(vehicles,HttpStatus.OK);
		assertEquals(vehicleController.findAll(),response);
		
	}
	
	@Test
	@DisplayName(value="create_vehicle_successful")
	public void creat_vehicle_correct() {
		when(vehicleService.save(vehicleDTO1)).thenReturn(vehicle1);
		response = new ResponseEntity(vehicle1,HttpStatus.CREATED);
		assertEquals(vehicleController.create(vehicleDTO1),response);
	}
	
	@Test
	@DisplayName(value = "update_a_vehicle_successful")
	public void update_vehicle_correct() {
		when(vehicleService.update(1L, vehicleDTO1)).thenReturn(vehicle1);
		response = new ResponseEntity("change successful",HttpStatus.OK);
		assertEquals(vehicleController.update(1L, vehicleDTO1),response);
	}
	
	@Test
	@DisplayName(value = "vehicle_deleted_success")
	public void delete_vehicle_success() {
		response = new ResponseEntity("deleted",HttpStatus.OK);
		assertEquals(vehicleController.delete(1L),response);
		verify(vehicleService).delete(1L);
	}
}
