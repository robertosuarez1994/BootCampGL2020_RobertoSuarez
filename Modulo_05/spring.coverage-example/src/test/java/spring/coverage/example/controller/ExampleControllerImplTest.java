package spring.coverage.example.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import spring.coverage.example.model.Example;
import spring.coverage.example.service.ExampleService;

@ExtendWith(MockitoExtension.class)
public class ExampleControllerImplTest {

	@InjectMocks
	private ExampleController exampleController;
	
	@Mock
	private ExampleService exampleService;
	
	Example example,example2;
	List<Example> examples = new ArrayList<Example>();
	
	@BeforeEach
	void setup() {
		example = Example.builder()
				.id(633452)
				.name("Ejemplo de Covertura")
				.value(473632)
				.build();
		
		example2 = Example.builder()
				.id(743492)
				.name("Segundo Ejemplo de Covertura")
				.value(2455632)
				.build();
		
		examples.add(example);
		examples.add(example2);
	}

	@Test
	void getExampleByIdTest() {

		final Example response = this.exampleController.getExampleById(2347);
		assertThat(response).isNull();

	}
	
	@Test
	void getAllExamples() {
		when(exampleService.getAllExamples()).thenReturn(examples);
		assertEquals(exampleController.getAllExamples().size(),examples.size());
		assertNotNull(exampleController.getAllExamples());
	}
	
	@Test
	void createExample() {
		when(exampleService.createExample(example)).thenReturn(Boolean.TRUE);
		assertTrue(exampleController.createExample(example));
	}
	
	@Test()
	void createExampleFail() {
		when(exampleService.createExample(example)).thenThrow(UnsupportedOperationException.class);
		assertFalse(exampleController.createExample(example));
	}
}
