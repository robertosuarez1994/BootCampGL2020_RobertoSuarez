package mockito.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.model.Vehicle;


@ExtendWith(MockitoExtension.class)
class VehicleCrashTest {
	
	@Mock Vehicle vehicleMock;
	
	
	@Test
	void WhenNoCrashNoValueThenOk() {
		VehicleCrash crashTest = new VehicleCrash();
		
		assertEquals(0, crashTest.getTotalEnergy());
		assertEquals(0, crashTest.getTotalVehicles());
		assertEquals("No crashes measured",crashTest.toString());
	}

	@Test
	void WhenCrashAndCorrectValueThenOk() {
		VehicleCrash crashTest = new VehicleCrash();
		double n1 = 10.0 , n2 = 5.0;
		double spectedEnergy = n1 * n2 * n2 / 2;
		
		Mockito.when(vehicleMock.getMass()).thenReturn(n1);
		Mockito.when(vehicleMock.getMaxSpeed()).thenReturn(n2);
		crashTest.crash(vehicleMock);
		assertEquals(crashTest.getTotalVehicles(),1);
		assertEquals(crashTest.getTotalEnergy(),spectedEnergy);
		
	}
	
	@Test 
	void WhenCrashVehicleReturnString() {
		VehicleCrash crashTest = new VehicleCrash();
		double n1 = 10.0 , n2 = 5.0;
		double spectedEnergy = n1 * n2 * n2 / 2;
		
		Mockito.when(vehicleMock.getMass()).thenReturn(n1);
		Mockito.when(vehicleMock.getMaxSpeed()).thenReturn(n2);
		crashTest.crash(vehicleMock);
		String expectedString = "Up to " + crashTest.getTotalEnergy() + " Joules in " + crashTest.getTotalVehicles() + " crashes measured";
		assertEquals(crashTest.toString(),expectedString);
		
	}
}