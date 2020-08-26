package spring.coverage.example.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import spring.coverage.example.model.Example;
import spring.coverage.example.service.impl.ExampleServiceImpl;

@ExtendWith(SpringExtension.class)
public class ExampleServiceTest {

	@InjectMocks
	private ExampleServiceImpl exampleService;
	
	Example example,example2;
	
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
	}
	
	@Test
	void getAllExamplesTest() {

		List<Example> result = this.exampleService.getAllExamples();
		assertThat(result).isNotNull();
	}
	
	@Test
	void getById() {
		assertEquals(example,exampleService.getById(1));
	}
	
	@Test
	void createExample(){
		assertTrue(exampleService.createExample(example));
	}
	
	@Test
	void createExampleFail() {
		example.setId(-1);
		assertThatThrownBy(() -> {
			exampleService.createExample(example);
		}).isInstanceOf(UnsupportedOperationException.class);
	}

}
