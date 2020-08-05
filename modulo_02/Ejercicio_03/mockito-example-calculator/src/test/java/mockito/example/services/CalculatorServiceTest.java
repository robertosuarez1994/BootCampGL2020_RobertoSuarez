/**
 * 
 */
package mockito.example.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.exceptions.ZeroDivisionException;
import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;
import mockito.example.services.impl.DataServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
	@InjectMocks
	CalculatorServiceImpl calculator = new CalculatorServiceImpl();
	
	@Mock
	BasicOperationsService bosMock;
	
	@Mock 
	DataService dataServiceMock;
	
	int[] listValues = {1,2,3,4,5}; 
	
	@Test
	void sumOperation() {
		int n1 = 2, n2 = 3;
		double expectedResult = n1 +  n2;
		Mockito.when(bosMock.add(n1,n2)).thenReturn(expectedResult);
		assertTrue(calculator.calculateSum(n1,n2) == expectedResult);
	}
	
	@Test
	void SubstractionOperation() {
		int n1 = 2, n2 = 3; 
		double expectedResult = -1;
		Mockito.when(bosMock.subtract(n1,n2)).thenReturn(expectedResult);
		assertTrue(calculator.calculateSubstraction(n1,n2) == expectedResult);
	}
	@Test
	void DivOperation() {
		int n1 = 4, n2 = 2;
		double expectedResult = 2;
		Double result = null;
		Mockito.when(bosMock.divide(n1,n2)).thenReturn(expectedResult);
		try {
			result = calculator.calculateDivision(n1, n2);
		}
		catch(ZeroDivisionException e) {
			e.getMessage();
		}
		assertTrue( result == expectedResult);
	}
	@Test
	void multOperation() {
		int n1 = 2, n2 = 3;
		double expectedResult = 6 ;
		Mockito.when(bosMock.multiply(n1,n2)).thenReturn(expectedResult);
		assertTrue(calculator.calculateMultiplication(n1,n2) == expectedResult);
	}
	
	@Test
	void whenAverageCalculateCoorectValueThenOk() {
		Mockito.when(dataServiceMock.getListOfNumbers()).thenReturn(this.listValues);
		calculator.setDataService(dataServiceMock);
		assertTrue( calculator.calculateAverage() == 3);
	}
	
	@Test
	void whenListNumbersReturnNull() {
		Mockito.when(dataServiceMock.getListOfNumbers()).thenReturn(null);
		calculator.setDataService(dataServiceMock);
		assertThrows(NullPointerException.class , ()->{calculator.calculateAverage();});
	}
	
	@Test
	void DivOperationWithZero() {
		int n1 = 4, n2 = 0;
		assertThrows(ZeroDivisionException.class , ()->{calculator.calculateDivision(n1, n2);});
		//Implementar la verifiacion correspondiente
		//para comprobar que el metodo division de BOS
		//nunca se ejecuta
	}
	
	@Test
	void PrintResultWithSumCorrect() {
		int n1 = 2 , n2 = 3;
		double expectResultSum = 5;
		String expectedResult = "El resultado es: 5.0";
		Mockito.when(bosMock.add(n1,n2)).thenReturn(expectResultSum);
		double result = calculator.calculateSum(n1,n2);
		assertTrue(calculator.printResult(result).equals(expectedResult));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,10})
	void valueIsEvenTrue(int a) {
		assertFalse(calculator.isOdd(a));
		assertTrue(calculator.isEven(a));
	}

	
	@Test
	void testBasicOperationsServiceSummCorrectThenOk() {
		BasicOperationsServiceImpl spyBsoImpl = spy(BasicOperationsServiceImpl.class);
		spyBsoImpl.add(2,2);
		verify(spyBsoImpl).add(2,2);
		verify(spyBsoImpl,never()).divide(2,2);
	}
	
	@Test
	void testDataServiceWithSpy() {
		int[] myListInt = {1,2,3,4,5,6};
		int[] myListInt2 = {1,2,3};
		DataServiceImpl spyDataServiceImpl = spy(new DataServiceImpl());
		calculator.setDataService(spyDataServiceImpl);
		
		Mockito.when(spyDataServiceImpl.getListOfNumbers()).thenReturn(myListInt);
		spyDataServiceImpl.setListOfNumbers(myListInt2);
		
		assertTrue(spyDataServiceImpl.getListOfNumbers().length == myListInt.length);
		
	}
	
}
