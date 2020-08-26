package com.globallogic.bootcampgl.vehiculo;



import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.boot.test.context.SpringBootTest;

import com.globallogic.bootcampgl.vehiculo.DTO.VehicleDTO;
import com.globallogic.bootcampgl.vehiculo.entity.Model;
import com.globallogic.bootcampgl.vehiculo.entity.Type;
import com.globallogic.bootcampgl.vehiculo.entity.Vehicle;
import com.globallogic.bootcampgl.vehiculo.repository.ModelRepository;
import com.globallogic.bootcampgl.vehiculo.repository.TypeRepository;
import com.globallogic.bootcampgl.vehiculo.repository.VehicleRepository;
import com.globallogic.bootcampgl.vehiculo.service.VehicleService;

@ExtendWith(MockitoExtension.class)
class VehicleApplicationTests {

	@Mock
	VehicleRepository vehicleRepository;
	
	@Mock
	TypeRepository typeRepo;
	
	@Mock
	ModelRepository modelRepo;
	
	@InjectMocks
	VehicleService vehicleService;
	
	VehicleDTO vehicleDTO1;
	Optional<Vehicle> oVehicle1,oVechicleEmpty;
	Optional<Model>oModel1;
	Optional<Type>oType1;
	Vehicle vehicle1;
	Model model1;
	Type type1;
	List<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	@BeforeEach
	void setup() {
		Date dateMock = new Date();
		model1 = new Model(1L,12L,"modelo1","sarasa");
		type1 = new Type(1l,12l,"sarasaa","sarasa");
		vehicle1 = new Vehicle(1L,123L,"ident",dateMock,model1,type1);
		vehicleDTO1 = new VehicleDTO();
		vehicleDTO1.setCode(123L);
		vehicleDTO1.setProd_date(vehicle1.getProd_date());
		vehicleDTO1.setIdentification(vehicle1.getIdentification());
		vehicleDTO1.setModel_id(model1.getId());
		vehicleDTO1.setType_id(type1.getId());
		vehicles.add(vehicle1);
		oVehicle1 = Optional.of(vehicle1);
		oVechicleEmpty = Optional.empty();
		oModel1 = Optional.of(model1);
		oType1 = Optional.of(type1);
	
	}
	
	@DisplayName(value = "getAll")
	@Test
	public void get_all_Vehicles_successful(){
		when(vehicleRepository.findAll()).thenReturn(vehicles);
		assertEquals(vehicleService.findAll().size(),vehicles.size());
	}
	
	@Test
	@DisplayName(value = "getById")
	public void get_by_id_successful() {
		when(vehicleRepository.findById(1L)).thenReturn(oVehicle1);
		assertTrue(vehicleService.findById(1L).equals(vehicle1));
	}
	
	@Test
	@DisplayName(value = "getById_notFound")
	public void get_by_id_when_id_not_found() {
		when(vehicleRepository.findById(1L)).thenReturn(oVechicleEmpty);
		assertThatThrownBy(() -> {
			vehicleService.findById(1L);
		}).isInstanceOf(NoSuchElementException.class);
	}
	
	@Test
	@DisplayName(value = "save_new_vehicle_successful")
	public void save_new_vehicle_correct() {
		vehicle1.setId(null);
		when(vehicleRepository.save(vehicle1)).thenReturn(vehicle1);
		when(modelRepo.findById(vehicleDTO1.getModel_id())).thenReturn(oModel1);
		when(typeRepo.findById(vehicleDTO1.getType_id())).thenReturn(oType1);
		
		assertTrue(vehicleService.save(vehicleDTO1).equals(vehicle1));
	}

	@Test
	@DisplayName(value= "update_successful")
	public void update_vehicle_correct() {
		VehicleDTO updateDTO = new VehicleDTO();
		updateDTO.setCode(9999L);
		updateDTO.setIdentification("MOD");
		vehicle1.setCode(vehicleDTO1.getCode());
		vehicle1.setIdentification(vehicleDTO1.getIdentification());
		
		when(vehicleRepository.findById(1L)).thenReturn(oVehicle1);
		when(vehicleRepository.save(vehicle1)).thenReturn(vehicle1);
		when(modelRepo.getOne(vehicleDTO1.getModel_id())).thenReturn(model1);
		when(typeRepo.getOne(vehicleDTO1.getType_id())).thenReturn(type1);

		assertTrue(vehicleService.update(1L, vehicleDTO1).equals(vehicle1));
		assertNotNull(vehicleService.update(1L, vehicleDTO1));
		assertEquals(vehicleService.update(1L, vehicleDTO1).getCode(),vehicle1.getCode());
	}
	
	
	
}
