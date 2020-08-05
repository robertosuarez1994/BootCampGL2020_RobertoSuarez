package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)
public class TestCarton {
	
	@InjectMocks
	CartonGenerator carton = new CartonGenerator();
	
	@Mock
	Random randMock = new Random();
	
	@Test
	void WhenIsGanadorReturnTrue() {
		Mockito.when(randMock.nextInt()).thenReturn(1);
		assertTrue(carton.isGanador());
	}
	
	
}
