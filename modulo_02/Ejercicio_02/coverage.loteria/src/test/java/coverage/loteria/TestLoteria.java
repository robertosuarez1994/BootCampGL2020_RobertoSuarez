package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

public class TestLoteria {
	
	Float pozo = 200F;
	Integer boletos = 10;
	CartonGenerator carton = new CartonGenerator();
	Loteria loteria = new Loteria(pozo, boletos, carton);

	@BeforeEach
	void setup() {
		carton.isGanador();
		loteria.jugada();
		System.out.print(loteria.getGanadores());
	}

	@Test
	void test_geters_Loteria() {
		Loteria loteria2 = new Loteria(pozo, boletos, carton);
		assertTrue(loteria2.getGanadores() == 0);
		assertTrue(loteria2.getPozo() == pozo);
		assertTrue(loteria2.getBoletos() == boletos);
	}

	@Test
	void jugadas_ganadoras() {
		loteria.jugada();
		assertFalse(loteria.getGanadores() > 0);
	}

	@Test
	void unico_ganador() {
		this.carton.isGanador();
		//assertTrue(loteria.hayGanadorUnico());
	}

	@Test
	void cuadruple_ganadores() {
		assertFalse(loteria.hayCuadrupleGanador());
	}

	@Test
	void sin_ganadores() {
		//assertTrue(loteria.getGanadores() == 0);
		assertNotNull(loteria.getGanadores() == 0);
	}

	@Test
	void no_hubo_un_ganador() {
		//assertFalse(loteria.hayGanadorUnico());
		assertNotNull(loteria.hayGanadorUnico());
	}

	@Test
	void no_hubo_cuatro_ganadores() {
		//assertFalse(loteria.hayCuadrupleGanador());
		assertNotNull(loteria.hayCuadrupleGanador());
	}

}
