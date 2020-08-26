package com.globallogic.bootcampgl.vehiculo;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
	
	}
	
	@DisplayName(value = "getAll")
	public void get_all_Vehicles_successful(){
		when(vehicleRepository.findAll()).thenReturn(vehicles);
		assertEquals(vehicleService.findAll().size(),vehicles.size());
	}

}
