package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)
public class TestLoteria {
	
	Float pozo = 200F;
	Integer boletos = 10;
	CartonGenerator carton = new CartonGenerator();
	Loteria loteria = new Loteria(pozo, boletos, carton);
	@Mock 
	CartonGenerator cartonMock = new CartonGenerator();	
	
	@BeforeEach
	void setup() {
		carton.isGanador();
		loteria.jugada();
		System.out.print(loteria.getGanadores());
	}

	@Test
	void test_geters_Loteria() {
		Loteria loteria2 = new Loteria(pozo, boletos, carton);
		assertEquals(loteria2.getGanadores(), 0);
		assertEquals(loteria2.getPozo() , pozo);
		assertEquals(loteria2.getBoletos() , boletos);
	}

	/*
	 * @Test void jugadas_ganadoras() { loteria.jugada();
	 * assertTrue(loteria.getGanadores() > 0); }
	 */

	@Test
	void cuadruple_ganadores() {
		assertFalse(loteria.hayCuadrupleGanador());
	}

	@Test
	void sin_ganadores() {
		assertEquals(loteria.getGanadores(),0);
		assertFalse(carton.isGanador());
	}

	@Test
	void no_hubo_un_ganador() {
		assertFalse(loteria.hayGanadorUnico());
	}

	@Test
	void no_hubo_cuatro_ganadores() {
		assertFalse(loteria.hayCuadrupleGanador());
	}
	
	@Test
	void WhenOneWiner() {
		Mockito.when(cartonMock.isGanador()).thenReturn(true);
		Loteria loteriaWin = new Loteria(pozo,1,cartonMock);
		loteriaWin.jugada();
		assertTrue(loteriaWin.hayGanadorUnico());
	}
	
	@Test
	void WhenFourWiner() {
		Mockito.when(cartonMock.isGanador()).thenReturn(true);
		assertTrue(cartonMock.isGanador());
		Loteria loteriaWin = new Loteria(pozo,4,cartonMock);
		loteriaWin.jugada();
		assertTrue(loteriaWin.hayCuadrupleGanador());
	}
	
	@Test
	void whenHaveWinners() {
		Integer winners = 5;
		Mockito.when(cartonMock.isGanador()).thenReturn(true);
		Loteria loteriaWin = new Loteria(pozo,winners,cartonMock);
		loteriaWin.jugada();
		assertEquals(loteriaWin.getGanadores(),winners);
	}

}
